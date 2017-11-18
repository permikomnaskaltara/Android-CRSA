package ileos.crsaencryption.entity;

import java.math.BigInteger;

public class KeyEntity {
    //private  BigInteger e;
    //private  BigInteger d;
    //private  BigInteger n;

    private  BigInteger e = new BigInteger("65537");
   private  BigInteger d = new BigInteger("86802054763100034621959298807853610457135279461025755730288733620103745236306097578233784740710253847895115587210489050541220025415116976323151729236063635550131764706617306641630328253201582907072142766674230263628113103795911298916883898937084721196593253580120712654108178423465881469943186757925435823681");
   private  BigInteger n = new BigInteger("126856352310438118121027262643169700930543100750094660451697724004565586289175647065041199503878510088964012805258536725210060137490645822792132612589062159929612456518967588431029787932110388515118039539439912490413215338929719373461451823075806201662859450209654718244783084395114758765407433894240654269729");


    public BigInteger getE() {
        return e;
    }

    public void setE(BigInteger e) {
        this.e = e;
    }

    public BigInteger getD() {
        return d;
    }

    public void setD(BigInteger d) {
        this.d = d;
    }

    public BigInteger getN() {
        return n;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }
}

    /*private  BigInteger e = new BigInteger("1765189790802679079243820922555688313867331057625947477462898583515965872649104920913445892704818178597498802325185462741886317749056630184847918422568892494436219283070747136932213812848522308344807966121912692286633864045024245784807138792731428117696492790504320756557018488791989033534716126094561236483803853883");
    private  BigInteger d = new BigInteger("1353986113537232850030719553021963217122477456259279755875129408885838907358761268683244491774252777952816176647604911576685895022879629022560251263430304337720517406378849789721996012958479865814823526923713793040962019293030277147968421720704330951512890624047345266929102903650037722900413838598637023662374798491299816227198384186732043318301085029717786166673418331466527865160298393408783532429676762194583818081364677552424503741134612998606973892571397279752291340721287677621024542699722222474075628922940334542910204831879701345407283055099184970130913069409666115629749829435438609982252871259362141749537911180858253119");
    private  BigInteger n = new BigInteger("4121792663569531035644072826563296363118508046726698272874113733529523859510036693546032981470415457109701158208037259133516941289879800492935066265545611101703697333719328658884398651734367362659246950659105417039090052645633461982954258498510312028851106919047119854661699733117730894030380596015982788001750508434035333230022898685570575432325027765673442213154761867963506629246067646779213333508387720144713073100207196707628033283656183686745511795783614166168947676784380104664452450315799946916530705374774646269531793271269247398073022749711474240211624212223427043670405698662157500363676571384057816276067957900331941497");
    */

//private  BigInteger e = new BigInteger("65537");
//private  BigInteger d = new BigInteger("86802054763100034621959298807853610457135279461025755730288733620103745236306097578233784740710253847895115587210489050541220025415116976323151729236063635550131764706617306641630328253201582907072142766674230263628113103795911298916883898937084721196593253580120712654108178423465881469943186757925435823681");
//private  BigInteger n = new BigInteger("126856352310438118121027262643169700930543100750094660451697724004565586289175647065041199503878510088964012805258536725210060137490645822792132612589062159929612456518967588431029787932110388515118039539439912490413215338929719373461451823075806201662859450209654718244783084395114758765407433894240654269729");

//private  BigInteger e = new BigInteger("10033035965493993873603872142411547423322161077136212050088672125218143656751041796326549172291320538205707526304104857607482676161449835823399202588029037");
//private  BigInteger d = new BigInteger("77372702627886367962946569595123751220083887780135667933461714912984630666380665238181603151996437258497936299253210565092663424439732728532727688828680428758609411366457560670955886763145531681267787085759981879370194674344240419485547748786857648103582717647720785111675804668848085006890538512299659924581");
//private  BigInteger n = new BigInteger("96394494908538376147162089475160241823934775234201905359638648630507536479663161623406448149817349628551016495745356707086323543593835239146271906897116502967571042869635463388613173072122034181516499243272691356109859403420508421797180944116506925622349916944867396381343100903416829785586901702403640116523");