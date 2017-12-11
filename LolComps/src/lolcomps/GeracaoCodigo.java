/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lolcomps;

import javafx.scene.Camera;
import java.util.Random;
/**
 *
 * @author Bruno
 */
public class GeracaoCodigo extends compsBaseVisitor<Object>{
    SaidaParser script;
    String listaCarac[][];
    String barra="\\\\";
    int qtd;
    public GeracaoCodigo() {
        if(!System.getProperty("os.name").contains("Windows")){
            barra="/";
        }
        listaCarac= new String[12][2];
        qtd=0;
        script= new SaidaParser();
        script.println("import cv2\n" +
"\n" +
"def transparentOverlay(src , overlay , pos=(0,0),scale = 1):\n" +
"    overlay = cv2.resize(overlay,(0,0),fx=scale,fy=scale)\n" +
"    h,w,_ = overlay.shape  # Size of foreground\n" +
"    rows,cols,_ = src.shape  # Size of background Image\n" +
"    y,x = pos[0],pos[1]    # Position of foreground/overlay image\n" +
"    \n" +
"    #loop over all pixels and apply the blending equation\n" +
"    for i in range(h):\n" +
"        for j in range(w):\n" +
"            if x+i >= rows or y+j >= cols:\n" +
"                continue\n" +
"            alpha = float(overlay[i][j][3]/255.0) # read the alpha channel \n" +
"            src[x+i][y+j] = alpha*overlay[i][j][:3]+(1-alpha)*src[x+i][y+j]\n" +
"    return src\n" +
"\n" +
"def campeoes(top,jungle,mid,adc,sup,bans,comp,carac):\n" +
"    img = cv2.imread(\"output"+barra+"cartaolol.bmp\")\n" +
"    topc=112\n" +
"    junglec=302\n" +
"    midc=493\n" +
"    ad=658\n" +
"    supc=805\n" +
"    inicio=228\n" +
"    bansc=833\n" +
"    bansy=700\n" +
"    retx=13\n" +
"    rety=687\n" +
"    tamx=250\n" +
"    tamy=50\n" +
"    qtd=0\n" +
"    strcomp = comp.lower().capitalize()\n" +
"    string = len(comp)\n" +
"    cv2.putText(img,strcomp,(470- string*8,107),cv2.FONT_HERSHEY_SIMPLEX,1.4,(255,255,255),2)\n" +
"    ret = cv2.imread('output"+barra+"ret.png',cv2.IMREAD_UNCHANGED)\n" +
"    for campeao in top:\n" +
"        camp = cv2.imread('output"+barra+"'+campeao+'.png')\n" +
"        img[inicio:inicio+100,topc:topc+100] = camp\n" +
"        inicio+=102\n" +
"    inicio=228\n" +
"    for campeao in jungle:\n" +
"        camp = cv2.imread('output"+barra+"'+campeao+'.png')\n" +
"        img[inicio:inicio+100,junglec:junglec+100] = camp\n" +
"        inicio+=102     \n" +
"    inicio=228\n" +
"    for campeao in mid:\n" +
"        camp = cv2.imread('output"+barra+"'+campeao+'.png')\n" +
"        img[inicio:inicio+100,midc:midc+100] = camp\n" +
"        inicio+=102     \n" +
"    inicio=228\n" +
"    for campeao in adc:\n" +
"        camp = cv2.imread('output"+barra+"'+campeao+'.png')\n" +
"        img[ inicio: inicio+100 , ad: ad+100] = camp\n" +
"        inicio+=102     \n" +
"    inicio=228\n" +
"    for campeao in sup:\n" +
"        camp = cv2.imread('output"+barra+"'+campeao+'.png')\n" +
"        img[inicio:inicio+100,supc:supc+100] = camp\n" +
"        inicio+=102\n" +
"    for campeao in bans:\n" +
"        camp = cv2.imread('output"+barra+"'+campeao+'Ban.png')\n" +
"        img[bansy:bansy+80,bansc:bansc+80] = camp\n" +
"        bansy+=90\n" +
"    i=0\n" +
"    for c in carac:\n" +
"        if i%2 == 0:\n" +
"            transparentOverlay(img,ret,(retx,rety),0.7)\n" +
"            cv2.putText(img,str(c),(retx+10,rety+22),cv2.FONT_HERSHEY_SIMPLEX,0.7,(255,255,255),2)\n" +
"            qtd+=1\n" +
"            if qtd==6:\n" +
"                retx=291\n" +
"                rety=687\n" +
"            else:\n" +
"                rety+=52\n" +
"        else:\n" +
"            if qtd==6:\n" +
"                cv2.putText(img,str(c),(218,rety+52*6-26),cv2.FONT_HERSHEY_SIMPLEX,0.7,(255,255,255),2)\n" +
"            else:\n" +
"                cv2.putText(img,str(c),(retx+205,rety-26),cv2.FONT_HERSHEY_SIMPLEX,0.7,(255,255,255),2)\n" +
"            \n" +
"        i+=1\n" +
"    cv2.imwrite('Comps"+barra+"'+comp+\".bmp\",img)");
    }

    @Override
    public Object visitPrograma(compsParser.ProgramaContext ctx) {
        visitNome(ctx.nome());
        visitPosicoes(ctx.posicoes());
        visitCarac(ctx.carac());
        script.println("campeoes(top,jungle,mid,adc,sup,bans,nome_comp,carac)");
        script.println("imagem = cv2.imread('Comps"+barra+"'+nome_comp+'.bmp')");
        script.println("res=cv2.resize(imagem,(700,700),interpolation = cv2.INTER_CUBIC)");
        script.println("cv2.imshow(nome_comp,res)" );
        script.println("cv2.waitKey(0)" );
        qtd=0;
        visitMais_comp(ctx.mais_comp());
        return script;
    }

    public String sugereBan(String carac)
    {
        String engage[] = {"Janna","Gragas","Nami","Braum","Varus"};
        String disengage[] = {"Ezreal","Xerath","Karma","Jayce"};
        String siege[] = {"Sejuani", "JarvanIV","Camille","Maokai","Jhin"};
        String poke[] = siege;
        String pickoff[] = {"Lulu","Janna","Karma","Zilean","Morgana"};
        String cc[] = {"Sivir","Fizz","Lulu","Morgana","Yasuo"};
        String splitpush[] = {"Ziggs","Shen","Fiora","TahmKench","Gangplank"};
        String globalpresence[] = {"Lulu","Braum","Gragas","Leblanc","TahmKench"};
        String clearwave[] = siege;
        String early[] = {"Ziggs","Sivir","Thresh","Lulu","Braum"};  
        String late[] = {"LeeSin","JarvanIV","XinZhao","Leblanc","Jayce"};
        String mid[] = late;     
        if(carac.equals("engage"))
            return "'"+engage[new Random().nextInt(5)]+"'";
        else if(carac.equals("disengage"))
            return "'"+disengage[new Random().nextInt(5)]+"'";
        else if(carac.equals("siege"))
            return "'"+siege[new Random().nextInt(5)]+"'";
        else if(carac.equals("poke"))
            return "'"+poke[new Random().nextInt(5)]+"'";
        else if(carac.equals("pickoff"))
            return "'"+pickoff[new Random().nextInt(5)]+"'";
        else if(carac.equals("cc"))
            return "'"+cc[new Random().nextInt(5)]+"'";
        else if(carac.equals("splitpush"))
            return "'"+splitpush[new Random().nextInt(5)]+"'";
        else if(carac.equals("globalpresence"))
            return "'"+globalpresence[new Random().nextInt(5)]+"'";
        else if(carac.equals("clearwave"))
            return "'"+clearwave[new Random().nextInt(5)]+"'";        
        else if(carac.equals("early"))
            return "'"+early[new Random().nextInt(5)]+"'";        
        else if(carac.equals("mid"))
            return "'"+mid[new Random().nextInt(5)]+"'";
        else
            return "'"+late[new Random().nextInt(5)] +"'";
    }
    
    @Override
    public Object visitMais_lista(compsParser.Mais_listaContext ctx) {
        if(ctx.lista()!=null)
        {
            visitLista(ctx.lista());
            visitMais_lista(ctx.mais_lista());
        }
        return null;
    }

    @Override
    public Object visitLista(compsParser.ListaContext ctx) {
        listaCarac[qtd][0]=ctx.getChild(0).getText();
        listaCarac[qtd][1]= ctx.VALOR().getText();
        qtd++;
        return null;
    }

    @Override
    public Object visitCarac(compsParser.CaracContext ctx) {
        visitLista(ctx.lista());
        visitMais_lista(ctx.mais_lista());
        ordenaCarac();
        adicionaBans();
        String carac = "carac=['"+listaCarac[0][0]+"',"+listaCarac[0][1];
        int i;
        for(i=1;i<qtd;i++){
            carac+=",'"+listaCarac[i][0]+"',"+listaCarac[i][1];
        }
        carac+="]";
        script.println(carac);
        return null;
    }

    @Override
    public Object visitCampeoes(compsParser.CampeoesContext ctx) {
        if(ctx.mais_campeoes()!=null)
            return modifica(ctx.CAMPEAO().getText()) + (String) visitMais_campeoes(ctx.mais_campeoes());
        else
            return modifica(ctx.CAMPEAO().getText());
    }
    
    public String modifica(String string)
    {
        String campeao = string.toLowerCase().substring(1,string.length()-1);
        if(campeao.equals("aurelion sol"))
            campeao="'AurelionSol'";
        else if(campeao.equals("lee sin"))
            campeao="'LeeSin'";
        else if(campeao.equals("cho'gath"))
            campeao="'Chogath'";
        else if(campeao.equals("dr. mundo"))
            campeao="'DrMundo'";
        else if(campeao.equals("jarvan iv"))
            campeao="'JarvanIV'";
        else if(campeao.equals("kha'zix"))
            campeao="'Khazix'";
        else if(campeao.equals("kog'maw"))
            campeao="'KogMaw'";
        else if(campeao.equals("master yi"))
            campeao="'MasterYi'";
        else if(campeao.equals("miss fortune"))
            campeao="'MissFortune'";
        else if(campeao.equals("rek'sai"))
            campeao="'RekSai'";
        else if(campeao.equals("tahm kench"))
            campeao="'TahmKench'";
        else if(campeao.equals("twisted fate"))
            campeao="'TwistedFate'";
        else if(campeao.equals("vel'koz"))
            campeao="'Velkoz'";
        else if(campeao.equals("xin zhao"))
            campeao="'XinZhao'";
        else
            campeao="'"+(char) (campeao.charAt(0)-32) + campeao.substring(1, campeao.length())+"'";
        
        return campeao;
    }
    
    @Override
    public Object visitMais_campeoes(compsParser.Mais_campeoesContext ctx) {
        if(ctx.campeoes()!=null)
            return ","+visitCampeoes(ctx.campeoes());
        else
            return "";
    }

    @Override
    public Object visitSup(compsParser.SupContext ctx) {
        if(ctx.campeoes()!=null)
        script.println("sup=["+visitCampeoes(ctx.campeoes())+"]");
        return null;
    }

    @Override
    public Object visitAdc(compsParser.AdcContext ctx) {
        script.println("adc=["+visitCampeoes(ctx.campeoes())+"]");
        return null;
    }

    @Override
    public Object visitMid(compsParser.MidContext ctx) {
        script.println("mid=["+visitCampeoes(ctx.campeoes())+"]");
        return null;
    }

    @Override
    public Object visitJungle(compsParser.JungleContext ctx) {
        script.println("jungle=["+visitCampeoes(ctx.campeoes())+"]");
        return null;
    }

    @Override
    public Object visitTop(compsParser.TopContext ctx) {
        script.println("top=["+visitCampeoes(ctx.campeoes())+"]");
        return null;
    }

    @Override
    public Object visitListacamps(compsParser.ListacampsContext ctx) {
        visitTop(ctx.top());
        visitJungle(ctx.jungle());
        visitMid(ctx.mid());
        visitAdc(ctx.adc());
        visitSup(ctx.sup());
        return null;
    }

    public void ordenaCarac()
    {
        int i,j,pos;
        float val;
        String car,valor;
        for(i=0;i<qtd;i++)
        {
           val = Float.parseFloat(listaCarac[i][1]);
           pos=i;
           for(j=i;j<qtd;j++)
           {
               if(Float.parseFloat(listaCarac[j][1])>val)
                {
                    val = Float.parseFloat(listaCarac[j][1]);
                    car= listaCarac[pos][0];
                    valor=listaCarac[pos][1];
                    listaCarac[pos][0]=listaCarac[j][0];
                    listaCarac[pos][1]=listaCarac[j][1];
                    listaCarac[j][0]=car;
                    listaCarac[j][1]=valor;
                }
               
           }
        }  
        
    }
    public void adicionaBans()
    {
        String bans="bans=[";
        int i;
        if(qtd>3)
            for(i=0;i<3;i++){
                if(i>0)
                    bans+=","+sugereBan(listaCarac[i][0]);
                else
                    bans+=sugereBan(listaCarac[i][0]);                    
            }
        else            
            for(i=0;i<qtd;i++){
                if(i>0)
                    bans+=","+sugereBan(listaCarac[i][0]);
                else
                    bans+=sugereBan(listaCarac[i][0]);                    
            }
        bans+="]";
        script.println(bans);
            
    }
    
    @Override
    public Object visitPosicoes(compsParser.PosicoesContext ctx) {
        visitListacamps(ctx.listacamps());
        return null;
    }

    @Override
    public Object visitNome(compsParser.NomeContext ctx) {
        script.println("nome_comp = '"+ ctx.IDENT().getText()+"'");
        return null;
    }

    @Override
    public Object visitMais_comp(compsParser.Mais_compContext ctx) {
        if(ctx.nome()!=null)
        {
            visitNome(ctx.nome());
            visitPosicoes(ctx.posicoes());
            visitCarac(ctx.carac());
            script.println("campeoes(top,jungle,mid,adc,sup,bans,nome_comp,carac)");
            script.println("imagem = cv2.imread('Comps"+barra+"'+nome_comp+'.bmp')");
            script.println("res=cv2.resize(imagem,(700,700),interpolation = cv2.INTER_CUBIC)");
            script.println("cv2.imshow(nome_comp,res)" );
            script.println("cv2.waitKey(0)" );
            visitMais_comp(ctx.mais_comp());
        }
        return null;
    }
    
    
}
