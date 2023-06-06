package com.unionpay.mobile.android.pboctransaction.samsung;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.tsmservice.UPTsmAddon;
import com.unionpay.tsmservice.data.Amount;
import com.unionpay.tsmservice.request.CloseChannelRequestParams;
import com.unionpay.tsmservice.request.GetCardInfoBySpayRequestParams;
import com.unionpay.tsmservice.request.GetSeAppListRequestParams;
import com.unionpay.tsmservice.request.GetVendorPayStatusRequestParams;
import com.unionpay.tsmservice.request.InitRequestParams;
import com.unionpay.tsmservice.request.OpenChannelRequestParams;
import com.unionpay.tsmservice.request.SendApduRequestParams;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class f implements com.unionpay.mobile.android.pboctransaction.c {
    private GetVendorPayStatusRequestParams C;
    private InitRequestParams H;
    private SendApduRequestParams I;
    private Context k;
    private com.unionpay.mobile.android.pboctransaction.b l;
    private a m;
    private UPTsmAddon n;
    String a = "19999741583305435775450371903957622252895007857586703985696530069777024392884287211670048223494223356836139331264745305488035196420545843046674853984852305228918004888414759300445308845681087472809487791392726663269247999482633231304479943902981311338709709401000108625221857486530967716878328228310703650408575058288784573884262229674701501842066793928002725038356122707147929560460157457327696696471785787505023643000687928051333648369477362945785046976181683285277919023274376124429148429078602516462345014971452220809120399264066736558357572250447243744965533695780751271768398207631002867947152625578881506566297";
    String b = "65537";
    String c = "5929703506495688276130676968213384164609348882017291684789802337394713840702726472221198819456433069055388915357817202968369194525956730949539025096963015440180443916974948318765778051794088998339276397676916425744003507605582286608745438301704836361482343765671805403004194772735755889141443700570750608527755694790475628670051863813384800013641474007746161600969180035295709344887092512089121125289090881005234379649440422346798246278284328310221953743757037875834557694749810951089453346522229122216198442376081589767583019062954875861469699069474707285206935898628020341168773624455554331118138151051364372906861";
    String d = "UnionPay";
    private final String i = "A0000003334355502D4D4F42494C45";
    private final int j = 10000;
    private Handler o = null;
    private int p = 0;
    private final int q = 8;
    private boolean r = false;
    private String s = "-1";
    private String t = "";
    private boolean u = false;
    private String v = null;
    private boolean w = false;
    private String x = "";
    private String y = "-1";
    private String z = "-1";
    private String A = "";
    private String B = "";
    String e = "";
    boolean f = false;
    boolean g = false;
    boolean h = false;
    private long D = 8000;
    private boolean E = false;
    private final Handler.Callback F = new g(this);
    private final Handler G = new Handler(this.F);
    private final UPTsmAddon.UPTsmConnectionListener J = new h(this);

    /* loaded from: classes6.dex */
    public interface a {
        void a(boolean z);
    }

    public f(a aVar) {
        this.m = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(f fVar, int i, String str) {
        if (i == 1000) {
            fVar.a(false);
            return;
        }
        if (i != 1018) {
            switch (i) {
                case 1011:
                    k.c("uppay", "open channel fail");
                    fVar.s = null;
                    fVar.t = "";
                    fVar.r = true;
                    return;
                case 1012:
                    k.c("uppay", "apdu fail");
                    fVar.G.removeMessages(3);
                    fVar.u = true;
                    return;
                case 1013:
                    k.c("uppay", "close channel fail");
                    fVar.w = true;
                    return;
                case 1014:
                    fVar.o.sendMessage(fVar.G.obtainMessage(8, null));
                    return;
                case 1015:
                    k.c("uppay-spay", "get spay list call back");
                    fVar.o.sendMessage(fVar.o.obtainMessage(2001, str));
                    return;
                case 1016:
                    break;
                default:
                    return;
            }
        }
        k.c("uppay-spay", "check spay support fail");
        fVar.m.a(false);
    }

    private void a(String str, String str2) {
        this.I = new SendApduRequestParams();
        this.I.setChannel(str2);
        this.I.setHexApdu(str);
        if (this.f) {
            this.I.setReserve(g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.l != null) {
            if (z) {
                this.l.a();
            } else {
                this.l.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean c(f fVar) {
        fVar.u = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.H == null) {
            this.H = new InitRequestParams();
            if (this.f) {
                this.H.setSignature(g());
                this.H.setReserve(g());
            }
        }
        try {
            int init = this.n.init(this.H, new e(1000, this.G));
            if (init != 0) {
                this.G.sendMessage(Message.obtain(this.G, 1, 1000, 0, ""));
            } else {
                this.G.sendMessageDelayed(Message.obtain(this.G, 4, 1000, 0, ""), this.D);
            }
            k.c("uppay", "ret = ".concat(String.valueOf(init)));
        } catch (RemoteException e) {
            a(false);
            e.printStackTrace();
        }
    }

    private String g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signature", this.e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        this.t = "";
        this.r = false;
        try {
            OpenChannelRequestParams openChannelRequestParams = new OpenChannelRequestParams();
            openChannelRequestParams.setAppAID(str);
            if (this.f) {
                openChannelRequestParams.setReserve(g());
            }
            if (this.n.openChannel(openChannelRequestParams, new e(1011, this.G)) != 0) {
                this.G.sendMessage(Message.obtain(this.G, 1, 1011, 0, ""));
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        while (TextUtils.isEmpty(this.t) && !this.r) {
        }
        if ("A0000003334355502D4D4F42494C45".equals(str)) {
            this.y = this.s;
        } else {
            this.z = this.s;
        }
        this.r = false;
        return this.t;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final ArrayList<com.unionpay.mobile.android.model.c> a(com.unionpay.mobile.android.pboctransaction.d dVar) {
        if (this.n != null) {
            try {
                if (com.unionpay.mobile.android.model.b.aB && com.unionpay.mobile.android.model.b.aA && com.unionpay.mobile.android.model.b.bo) {
                    GetCardInfoBySpayRequestParams getCardInfoBySpayRequestParams = new GetCardInfoBySpayRequestParams();
                    Amount amount = new Amount();
                    amount.setProductPrice(this.A);
                    String e = com.unionpay.mobile.android.pboctransaction.e.e(this.B);
                    if (!TextUtils.isEmpty(e)) {
                        amount.setCurrencyType(e);
                    }
                    getCardInfoBySpayRequestParams.setAmount(amount);
                    if (this.f) {
                        getCardInfoBySpayRequestParams.setReserve(g());
                    }
                    int cardInfoBySamsungPay = this.n.getCardInfoBySamsungPay(getCardInfoBySpayRequestParams, new e(1015, this.G));
                    if (cardInfoBySamsungPay != 0) {
                        this.G.sendMessage(Message.obtain(this.G, 1, 1015, 0, ""));
                    } else {
                        this.G.sendMessageDelayed(Message.obtain(this.G, 4, 1015, 0, ""), 8000L);
                    }
                    k.c("uppay", "readList: ".concat(String.valueOf(cardInfoBySamsungPay)));
                } else {
                    GetSeAppListRequestParams getSeAppListRequestParams = new GetSeAppListRequestParams();
                    if (this.f) {
                        getSeAppListRequestParams.setReserve(g());
                    }
                    if (this.n.getSEAppList(getSeAppListRequestParams, new e(1014, this.G)) != 0) {
                        this.G.sendMessage(Message.obtain(this.G, 1, 1014, 0, ""));
                    } else {
                        this.G.sendMessageDelayed(Message.obtain(this.G, 4, 1014, 0, ""), this.D);
                    }
                }
            } catch (RemoteException e2) {
                a(false);
                e2.printStackTrace();
            } catch (Exception e3) {
                a(false);
                e3.printStackTrace();
            }
            k.c("uppay", "readList");
            return null;
        }
        return null;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a() {
        if (this.n != null) {
            this.n.removeConnectionListener(this.J);
            this.n.unbind();
        }
    }

    public final void a(Handler handler) {
        this.o = handler;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a(com.unionpay.mobile.android.pboctransaction.b bVar, Context context) {
        this.l = bVar;
        this.k = context;
        try {
            this.e = com.unionpay.mobile.android.pboctransaction.samsung.a.a(KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateKeySpec(new BigInteger(this.a), new BigInteger(this.c))), this.d);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e2) {
            e2.printStackTrace();
        }
        if (com.unionpay.mobile.android.model.b.bm) {
            this.D = LocationStrategy.LOCATION_TIMEOUT;
        }
        this.f = !"com.unionpay.uppay".equals(com.unionpay.mobile.android.utils.f.b(this.k));
        this.n = UPTsmAddon.getInstance(context);
        if (!this.g) {
            this.n.addConnectionListener(this.J);
            this.g = true;
        }
        k.c("uppay-spay", "type se  bind service");
        if (this.n != null && !this.n.isConnected()) {
            k.c("uppay", "bind service");
            if (this.n.bind()) {
                return;
            }
            a(false);
        } else if (this.n == null || !this.n.isConnected()) {
        } else {
            k.c("uppay", "tem service already connected");
            if (this.h) {
                a(true);
            } else {
                f();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(10:(1:26)|5|6|(1:8)|10|(1:11)|16|(1:18)|19|20)|4|5|6|(0)|10|(2:13|(1:11))|22|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        r7.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[Catch: RemoteException -> 0x0054, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0054, blocks: (B:8:0x0033, B:10:0x0046), top: B:24:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    @Override // com.unionpay.mobile.android.pboctransaction.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(byte[] r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            r6.v = r0
            r1 = 0
            r6.u = r1
            java.lang.String r2 = "uppay"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "--->"
            r3.<init>(r4)
            java.lang.String r4 = com.unionpay.mobile.android.pboctransaction.e.a(r7)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.unionpay.mobile.android.utils.k.a(r2, r3)
            r2 = 1
            if (r8 != 0) goto L2a
            java.lang.String r7 = com.unionpay.mobile.android.pboctransaction.e.a(r7)
            java.lang.String r8 = r6.z
        L26:
            r6.a(r7, r8)
            goto L33
        L2a:
            if (r8 != r2) goto L33
            java.lang.String r7 = com.unionpay.mobile.android.pboctransaction.e.a(r7)
            java.lang.String r8 = r6.y
            goto L26
        L33:
            com.unionpay.tsmservice.UPTsmAddon r7 = r6.n     // Catch: android.os.RemoteException -> L54
            com.unionpay.tsmservice.request.SendApduRequestParams r8 = r6.I     // Catch: android.os.RemoteException -> L54
            com.unionpay.mobile.android.pboctransaction.samsung.e r3 = new com.unionpay.mobile.android.pboctransaction.samsung.e     // Catch: android.os.RemoteException -> L54
            android.os.Handler r4 = r6.G     // Catch: android.os.RemoteException -> L54
            r5 = 1012(0x3f4, float:1.418E-42)
            r3.<init>(r5, r4)     // Catch: android.os.RemoteException -> L54
            int r7 = r7.sendApdu(r8, r3)     // Catch: android.os.RemoteException -> L54
            if (r7 == 0) goto L58
            android.os.Handler r7 = r6.G     // Catch: android.os.RemoteException -> L54
            android.os.Handler r8 = r6.G     // Catch: android.os.RemoteException -> L54
            java.lang.String r3 = ""
            android.os.Message r8 = android.os.Message.obtain(r8, r2, r5, r1, r3)     // Catch: android.os.RemoteException -> L54
            r7.sendMessage(r8)     // Catch: android.os.RemoteException -> L54
            goto L58
        L54:
            r7 = move-exception
            r7.printStackTrace()
        L58:
            android.os.Handler r7 = r6.G
            android.os.Handler r8 = r6.G
            r2 = 3
            android.os.Message r8 = android.os.Message.obtain(r8, r2)
            r2 = 10000(0x2710, double:4.9407E-320)
            r7.sendMessageDelayed(r8, r2)
        L66:
            java.lang.String r7 = r6.v
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L72
            boolean r7 = r6.u
            if (r7 == 0) goto L66
        L72:
            java.lang.String r7 = "uppay"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "mApduResult: "
            r8.<init>(r2)
            java.lang.String r2 = r6.v
            r8.append(r2)
            java.lang.String r2 = ",mApduReturn:"
            r8.append(r2)
            boolean r2 = r6.u
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.unionpay.mobile.android.utils.k.a(r7, r8)
            java.lang.String r7 = r6.v
            if (r7 == 0) goto Laa
            java.lang.String r7 = r6.v
            byte[] r0 = com.unionpay.mobile.android.pboctransaction.e.a(r7)
            java.lang.String r7 = "uppay"
            java.lang.String r8 = "ret1 <---"
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r8 = r8.concat(r2)
            com.unionpay.mobile.android.utils.k.a(r7, r8)
        Laa:
            java.lang.String r7 = "uppay"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "<---"
            r8.<init>(r2)
            java.lang.String r2 = r6.v
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.unionpay.mobile.android.utils.k.a(r7, r8)
            r6.u = r1
            java.lang.String r7 = "uppay"
            java.lang.String r8 = "ret2 <---"
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r8 = r8.concat(r1)
            com.unionpay.mobile.android.utils.k.a(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.pboctransaction.samsung.f.a(byte[], int):byte[]");
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void b() {
    }

    public final void b(String str) {
        this.A = str;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void c() {
        if (this.y != null && !"-1".equals(this.y)) {
            this.x = "";
            this.w = false;
            try {
                CloseChannelRequestParams closeChannelRequestParams = new CloseChannelRequestParams();
                closeChannelRequestParams.setChannel(this.y);
                if (this.f) {
                    closeChannelRequestParams.setReserve(g());
                }
                if (this.n.closeChannel(closeChannelRequestParams, new e(1013, this.G)) != 0) {
                    this.G.sendMessage(Message.obtain(this.G, 1, 1013, 0, ""));
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            while (TextUtils.isEmpty(this.x) && !this.w) {
            }
            this.y = "-1";
            this.w = false;
        }
        if (this.z == null || "-1".equals(this.z)) {
            return;
        }
        this.x = "";
        this.w = false;
        try {
            CloseChannelRequestParams closeChannelRequestParams2 = new CloseChannelRequestParams();
            closeChannelRequestParams2.setChannel(this.z);
            if (this.f) {
                closeChannelRequestParams2.setReserve(g());
            }
            if (this.n.closeChannel(closeChannelRequestParams2, new e(1013, this.G)) != 0) {
                this.G.sendMessage(Message.obtain(this.G, 1, 1013, 0, ""));
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
        while (TextUtils.isEmpty(this.x) && !this.w) {
        }
        this.z = "-1";
        this.w = false;
    }

    public final void c(String str) {
        this.B = str;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void d() {
    }

    public final boolean e() {
        try {
            k.c("uppay", "getVendorPayStatus()");
            if (this.C == null) {
                this.C = new GetVendorPayStatusRequestParams();
                if (this.f) {
                    this.C.setReserve(g());
                }
            }
            if (this.n.getVendorPayStatus(this.C, new e(1018, this.G)) != 0) {
                this.G.sendMessage(Message.obtain(this.G, 1, 1018, 0, ""));
                return false;
            }
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
