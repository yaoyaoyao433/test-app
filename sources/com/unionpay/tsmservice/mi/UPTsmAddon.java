package com.unionpay.tsmservice.mi;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.unionpay.tsmservice.mi.ITsmActivityCallback;
import com.unionpay.tsmservice.mi.ITsmCallback;
import com.unionpay.tsmservice.mi.ITsmService;
import com.unionpay.tsmservice.mi.data.Constant;
import com.unionpay.tsmservice.mi.request.AcquireSEAppListRequestParams;
import com.unionpay.tsmservice.mi.request.AddCardToVendorPayRequestParams;
import com.unionpay.tsmservice.mi.request.CancelPayRequestParams;
import com.unionpay.tsmservice.mi.request.CardListStatusChangedRequestParams;
import com.unionpay.tsmservice.mi.request.EncryptDataRequestParams;
import com.unionpay.tsmservice.mi.request.GetEncryptDataRequestParams;
import com.unionpay.tsmservice.mi.request.GetMessageDetailsRequestParams;
import com.unionpay.tsmservice.mi.request.GetSeIdRequestParams;
import com.unionpay.tsmservice.mi.request.GetTransactionDetailsRequestParams;
import com.unionpay.tsmservice.mi.request.GetVendorPayStatusRequestParams;
import com.unionpay.tsmservice.mi.request.InitRequestParams;
import com.unionpay.tsmservice.mi.request.OnlinePaymentVerifyRequestParams;
import com.unionpay.tsmservice.mi.request.PayResultNotifyRequestParams;
import com.unionpay.tsmservice.mi.request.PinRequestRequestParams;
import com.unionpay.tsmservice.mi.request.QueryVendorPayStatusRequestParams;
import com.unionpay.tsmservice.mi.request.RequestParams;
import com.unionpay.tsmservice.mi.request.SafetyKeyboardRequestParams;
import com.unionpay.tsmservice.mi.utils.IUPJniInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class UPTsmAddon {
    private static UPTsmAddon a;
    private static CopyOnWriteArrayList<UPTsmConnectionListener> b;
    private Context c;
    private ServiceConnection d = null;
    private ITsmService e = null;
    private boolean f = false;
    private HashMap<String, ITsmCallback> g = new HashMap<>();
    private HashMap<String, ITsmCallback> h = new HashMap<>();
    private HashMap<String, ITsmCallback> i = new HashMap<>();
    private HashMap<String, ITsmActivityCallback> j = new HashMap<>();
    private HashMap<String, ITsmCallback> k = new HashMap<>();
    private HashMap<String, ITsmCallback> l = new HashMap<>();
    private HashMap<String, ITsmCallback> m = new HashMap<>();
    private HashMap<String, ITsmCallback> n = new HashMap<>();
    private HashMap<String, ITsmCallback> o = new HashMap<>();
    private HashMap<String, ITsmCallback> p = new HashMap<>();
    private HashMap<String, ITsmCallback> q = new HashMap<>();
    private HashMap<String, ITsmCallback> r = new HashMap<>();
    private HashMap<String, ITsmCallback> s = new HashMap<>();
    private HashMap<String, ITsmCallback> t = new HashMap<>();
    private HashMap<String, ITsmCallback> u = new HashMap<>();
    private HashMap<String, ITsmCallback> v = new HashMap<>();
    private final Handler.Callback x = new Handler.Callback() { // from class: com.unionpay.tsmservice.mi.UPTsmAddon.1
        @Override // android.os.Handler.Callback
        public final synchronized boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    UPTsmAddon.a();
                    return true;
                case 1:
                    UPTsmAddon.b();
                    return true;
                default:
                    return false;
            }
        }
    };
    private final Handler y = new Handler(Looper.getMainLooper(), this.x);
    private int[] w = new int[19];

    /* loaded from: classes6.dex */
    public interface UPTsmConnectionListener {
        void onTsmConnected();

        void onTsmDisconnected();
    }

    /* loaded from: classes6.dex */
    public final class a extends ITsmActivityCallback.Stub {
        private int b = 1000;

        public a() {
        }

        @Override // com.unionpay.tsmservice.mi.ITsmActivityCallback
        public final void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
            UPTsmAddon.a((ITsmActivityCallback) UPTsmAddon.b(UPTsmAddon.this, this.b).get(UPTsmAddon.c(UPTsmAddon.this)), str, str2, i, bundle);
            UPTsmAddon.b(UPTsmAddon.this, this.b).remove(UPTsmAddon.c(UPTsmAddon.this));
        }
    }

    /* loaded from: classes6.dex */
    public final class b extends ITsmCallback.Stub {
        private int b;
        private int c;

        private b(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        /* synthetic */ b(UPTsmAddon uPTsmAddon, int i, int i2, byte b) {
            this(i, i2);
        }

        @Override // com.unionpay.tsmservice.mi.ITsmCallback
        public final void onError(String str, String str2) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("errorCode", str);
            bundle.putString("errorDesc", str2);
            UPTsmAddon.a((ITsmCallback) UPTsmAddon.a(UPTsmAddon.this, this.b).get(String.valueOf(this.c)), bundle);
            UPTsmAddon.a(UPTsmAddon.this, this.b).remove(String.valueOf(this.c));
            if (UPTsmAddon.a(UPTsmAddon.this, this.b).isEmpty()) {
                UPTsmAddon.this.w[this.b] = 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        @Override // com.unionpay.tsmservice.mi.ITsmCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onResult(android.os.Bundle r7) throws android.os.RemoteException {
            /*
                Method dump skipped, instructions count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unionpay.tsmservice.mi.UPTsmAddon.b.onResult(android.os.Bundle):void");
        }
    }

    static {
        try {
            System.loadLibrary("uptsmaddonmi");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        a = null;
        b = null;
    }

    private UPTsmAddon(Context context) {
        this.c = null;
        this.c = context;
        if (!a(context)) {
            throw new RuntimeException();
        }
    }

    private static int a(int i, RequestParams requestParams, ITsmCallback iTsmCallback) throws RemoteException {
        return new SessionKeyReExchange(a, i, requestParams, iTsmCallback).reExchangeKey();
    }

    private static int a(int i, SafetyKeyboardRequestParams safetyKeyboardRequestParams, int i2, OnSafetyKeyboardCallback onSafetyKeyboardCallback, Context context) throws RemoteException {
        return new SessionKeyReExchange(a, i, safetyKeyboardRequestParams, i2, onSafetyKeyboardCallback, context).reExchangeKey();
    }

    private static int a(RequestParams requestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        return new SessionKeyReExchange(a, 16, requestParams, iTsmCallback, iTsmProgressCallback).reExchangeKey();
    }

    private static String a(Bundle bundle) {
        String str = "";
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        if (marshall != null && marshall.length != 0) {
            str = c(Base64.encodeToString(marshall, 0));
        }
        obtain.recycle();
        return str;
    }

    static /* synthetic */ HashMap a(UPTsmAddon uPTsmAddon, int i) {
        switch (i) {
            case 0:
                return uPTsmAddon.g;
            case 1:
                return uPTsmAddon.h;
            case 2:
                return uPTsmAddon.i;
            case 3:
            case 4:
            case 5:
            case 13:
            default:
                return null;
            case 6:
                return uPTsmAddon.k;
            case 7:
                return uPTsmAddon.l;
            case 8:
                return uPTsmAddon.m;
            case 9:
                return uPTsmAddon.n;
            case 10:
                return uPTsmAddon.o;
            case 11:
                return uPTsmAddon.p;
            case 12:
                return uPTsmAddon.q;
            case 14:
                return uPTsmAddon.r;
            case 15:
                return uPTsmAddon.s;
            case 16:
                return uPTsmAddon.t;
            case 17:
                return uPTsmAddon.u;
            case 18:
                return uPTsmAddon.v;
        }
    }

    static /* synthetic */ void a() {
        if (b == null || b.size() <= 0) {
            return;
        }
        Iterator<UPTsmConnectionListener> it = b.iterator();
        while (it.hasNext()) {
            UPTsmConnectionListener next = it.next();
            if (next != null) {
                next.onTsmConnected();
            }
        }
    }

    static /* synthetic */ void a(ITsmActivityCallback iTsmActivityCallback, String str, String str2, int i, Bundle bundle) {
        if (iTsmActivityCallback != null) {
            try {
                iTsmActivityCallback.startActivity(str, str2, i, bundle);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    static /* synthetic */ void a(ITsmCallback iTsmCallback, Bundle bundle) {
        if (iTsmCallback != null) {
            try {
                String string = bundle.getString("errorCode");
                if ("10000".equals(string)) {
                    iTsmCallback.onResult(bundle);
                } else {
                    iTsmCallback.onError(string, bundle.getString("errorDesc"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean a(Context context) {
        try {
            return IUPJniInterface.iJE(context);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            return false;
        }
    }

    static /* synthetic */ HashMap b(UPTsmAddon uPTsmAddon, int i) {
        if (i != 1000) {
            return null;
        }
        return uPTsmAddon.j;
    }

    static /* synthetic */ void b() {
        if (b == null || b.size() <= 0) {
            return;
        }
        Iterator<UPTsmConnectionListener> it = b.iterator();
        while (it.hasNext()) {
            UPTsmConnectionListener next = it.next();
            if (next != null) {
                next.onTsmDisconnected();
            }
        }
    }

    private static boolean b(String str) {
        try {
            return IUPJniInterface.cSKV(str);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            return false;
        }
    }

    static /* synthetic */ String c(UPTsmAddon uPTsmAddon) {
        return uPTsmAddon.c.getPackageName();
    }

    private static String c(String str) {
        try {
            return IUPJniInterface.eMG(str);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            return "";
        }
    }

    private boolean c() {
        String f = f("com.unionpay.tsmservice.mi");
        return f != null && f.compareTo(Constant.APK_VERSION_010002) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str) {
        try {
            return IUPJniInterface.dMG(str);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            return "";
        }
    }

    private boolean e(String str) {
        String f = f("com.unionpay.tsmservice.mi");
        return f != null && f.compareTo(str) >= 0;
    }

    private String f(String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = this.c.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    private static String g(String str) {
        try {
            JSONObject jSONObject = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
            jSONObject.put("jarVersionCode", 18);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static synchronized UPTsmAddon getInstance(Context context) {
        synchronized (UPTsmAddon.class) {
            if (context == null) {
                return null;
            }
            if (a == null) {
                a = new UPTsmAddon(context.getApplicationContext());
            }
            if (b == null) {
                b = new CopyOnWriteArrayList<>();
            }
            return a;
        }
    }

    private String h(String str) {
        try {
            JSONObject jSONObject = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
            jSONObject.put("packageName", this.c.getPackageName());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static boolean isAppRunInBackground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return true;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (TextUtils.equals(runningAppProcessInfo.processName, context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                return false;
            }
        }
        return true;
    }

    public synchronized int acquireSEAppList(AcquireSEAppListRequestParams acquireSEAppListRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!e("01.00.08")) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(6, acquireSEAppListRequestParams, iTsmCallback);
            }
            AcquireSEAppListRequestParams acquireSEAppListRequestParams2 = new AcquireSEAppListRequestParams();
            String str = "";
            if (acquireSEAppListRequestParams != null) {
                str = acquireSEAppListRequestParams.getReserve();
                Bundle params = acquireSEAppListRequestParams.getParams();
                if (params != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("encryptData", a(params));
                    acquireSEAppListRequestParams2.setParams(bundle);
                }
            }
            acquireSEAppListRequestParams2.setReserve(c(h(g(str))));
            this.k.put(String.valueOf(this.w[6]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[6];
                iArr[6] = i2 + 1;
                int acquireSEAppList = iTsmService.acquireSEAppList(acquireSEAppListRequestParams2, new b(this, 6, i2, (byte) 0));
                if (acquireSEAppList != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.k;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[6] - 1;
                    iArr2[6] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == acquireSEAppList) {
                    return a(6, acquireSEAppListRequestParams, iTsmCallback);
                }
                return acquireSEAppList;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int addCardToVendorPay(AddCardToVendorPayRequestParams addCardToVendorPayRequestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        int i;
        if (addCardToVendorPayRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!e(com.unionpay.tsmservice.data.Constant.SUPPORTED_MIN_APK_VERSION)) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(addCardToVendorPayRequestParams, iTsmCallback, iTsmProgressCallback);
            }
            AddCardToVendorPayRequestParams addCardToVendorPayRequestParams2 = new AddCardToVendorPayRequestParams();
            Bundle params = addCardToVendorPayRequestParams.getParams();
            if (params != null) {
                Bundle bundle = new Bundle();
                bundle.putString("encryptData", a(params));
                addCardToVendorPayRequestParams2.setParams(bundle);
            }
            addCardToVendorPayRequestParams2.setReserve(c(h(g(addCardToVendorPayRequestParams.getReserve()))));
            this.t.put(String.valueOf(this.w[16]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[16];
                iArr[16] = i2 + 1;
                int addCardToVendorPay = iTsmService.addCardToVendorPay(addCardToVendorPayRequestParams2, new b(this, 16, i2, (byte) 0), iTsmProgressCallback);
                if (addCardToVendorPay != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.t;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[16] - 1;
                    iArr2[16] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == addCardToVendorPay) {
                    return a(addCardToVendorPayRequestParams, iTsmCallback, iTsmProgressCallback);
                }
                return addCardToVendorPay;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized void addConnectionListener(UPTsmConnectionListener uPTsmConnectionListener) {
        if (uPTsmConnectionListener != null) {
            b.add(uPTsmConnectionListener);
        }
    }

    public boolean bind() {
        if (this.d == null) {
            this.d = new ServiceConnection() { // from class: com.unionpay.tsmservice.mi.UPTsmAddon.2
                @Override // android.content.ServiceConnection
                public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    UPTsmAddon.this.f = true;
                    UPTsmAddon.this.e = ITsmService.Stub.asInterface(iBinder);
                    UPTsmAddon.this.y.sendEmptyMessage(0);
                }

                @Override // android.content.ServiceConnection
                public final synchronized void onServiceDisconnected(ComponentName componentName) {
                    UPTsmAddon.this.f = false;
                    UPTsmAddon.this.e = null;
                    UPTsmAddon.this.y.sendEmptyMessage(1);
                }
            };
        }
        if (this.f) {
            return true;
        }
        Intent intent = new Intent("com.unionpay.tsmservice.mi.UPTsmService");
        intent.setPackage("com.unionpay.tsmservice.mi");
        return this.c.bindService(intent, this.d, 1);
    }

    public synchronized int cancelPay() throws RemoteException {
        int i;
        if (!e("01.00.08")) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(13, (SafetyKeyboardRequestParams) null, 0, (OnSafetyKeyboardCallback) null, (Context) null);
            }
            CancelPayRequestParams cancelPayRequestParams = new CancelPayRequestParams();
            cancelPayRequestParams.setReserve(c(h(g(""))));
            try {
                int cancelPay = this.e.cancelPay(cancelPayRequestParams);
                if (-2 == cancelPay) {
                    return a(13, (SafetyKeyboardRequestParams) null, 0, (OnSafetyKeyboardCallback) null, (Context) null);
                }
                return cancelPay;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int cardListStatusChanged(CardListStatusChangedRequestParams cardListStatusChangedRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!e("01.00.08")) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(7, cardListStatusChangedRequestParams, iTsmCallback);
            }
            CardListStatusChangedRequestParams cardListStatusChangedRequestParams2 = new CardListStatusChangedRequestParams();
            cardListStatusChangedRequestParams2.setReserve(c(h(g(cardListStatusChangedRequestParams != null ? cardListStatusChangedRequestParams.getReserve() : ""))));
            this.l.put(String.valueOf(this.w[7]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[7];
                iArr[7] = i2 + 1;
                int cardListStatusChanged = iTsmService.cardListStatusChanged(cardListStatusChangedRequestParams2, new b(this, 7, i2, (byte) 0));
                if (cardListStatusChanged != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.l;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[7] - 1;
                    iArr2[7] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == cardListStatusChanged) {
                    return a(7, cardListStatusChangedRequestParams, iTsmCallback);
                }
                return cardListStatusChanged;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: all -> 0x006d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:8:0x000a, B:10:0x000e, B:12:0x001c, B:14:0x0022, B:15:0x0038, B:23:0x0052, B:18:0x0040, B:19:0x0048, B:20:0x0049, B:29:0x005b, B:30:0x0063, B:31:0x0064), top: B:45:0x000a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int clearEncryptData(int r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r5 < r0) goto L70
            r0 = 2002(0x7d2, float:2.805E-42)
            if (r5 <= r0) goto La
            goto L70
        La:
            com.unionpay.tsmservice.mi.ITsmService r0 = r4.e     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6a
            android.content.Context r0 = r4.c     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L6d
            boolean r0 = b(r0)     // Catch: java.lang.Throwable -> L6d
            r1 = 4
            r2 = 0
            if (r0 == 0) goto L64
            boolean r0 = r4.c()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L49
            com.unionpay.tsmservice.mi.request.ClearEncryptDataRequestParams r0 = new com.unionpay.tsmservice.mi.request.ClearEncryptDataRequestParams     // Catch: java.lang.Throwable -> L6d
            r0.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = ""
            java.lang.String r3 = g(r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = r4.h(r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = c(r3)     // Catch: java.lang.Throwable -> L6d
            r0.setReserve(r3)     // Catch: java.lang.Throwable -> L6d
            com.unionpay.tsmservice.mi.ITsmService r3 = r4.e     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L6d
            int r0 = r3.clearKeyboardEncryptData(r0, r5)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L6d
            goto L4f
        L3f:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L6d
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L6d
            r5.<init>()     // Catch: java.lang.Throwable -> L6d
            throw r5     // Catch: java.lang.Throwable -> L6d
        L49:
            com.unionpay.tsmservice.mi.ITsmService r0 = r4.e     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6d
            int r0 = r0.clearEncryptData(r5)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6d
        L4f:
            r3 = -2
            if (r3 != r0) goto L58
            int r5 = a(r1, r2, r5, r2, r2)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r4)
            return r5
        L58:
            monitor-exit(r4)
            return r0
        L5a:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L6d
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L6d
            r5.<init>()     // Catch: java.lang.Throwable -> L6d
            throw r5     // Catch: java.lang.Throwable -> L6d
        L64:
            int r5 = a(r1, r2, r5, r2, r2)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r4)
            return r5
        L6a:
            r5 = -1
        L6b:
            monitor-exit(r4)
            return r5
        L6d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L70:
            r5 = -3
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.tsmservice.mi.UPTsmAddon.clearEncryptData(int):int");
    }

    public synchronized int encryptData(EncryptDataRequestParams encryptDataRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        if (encryptDataRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(1, encryptDataRequestParams, iTsmCallback);
            }
            EncryptDataRequestParams encryptDataRequestParams2 = new EncryptDataRequestParams();
            String reserve = encryptDataRequestParams.getReserve();
            if (c()) {
                reserve = h(g(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                encryptDataRequestParams2.setReserve(c(reserve));
            }
            ArrayList arrayList = (ArrayList) encryptDataRequestParams.getData();
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 0) {
                    return -3;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < size; i++) {
                    String str = (String) arrayList.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        arrayList2.add(c(str));
                    }
                }
                encryptDataRequestParams2.setData(arrayList2);
            }
            this.h.put(String.valueOf(this.w[1]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[1];
                iArr[1] = i2 + 1;
                int encryptData = iTsmService.encryptData(encryptDataRequestParams2, new b(this, 1, i2, (byte) 0));
                if (encryptData != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.h;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[1] - 1;
                    iArr2[1] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == encryptData) {
                    return a(1, encryptDataRequestParams, iTsmCallback);
                }
                return encryptData;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        }
        return -1;
    }

    public int exchangeKey(String str, String[] strArr) throws RemoteException {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length == 0) {
            return -3;
        }
        if (this.e != null) {
            try {
                return this.e.exchangeKey(str, strArr);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        }
        return -1;
    }

    public Context getContext() {
        return this.c;
    }

    public synchronized int getEncryptData(GetEncryptDataRequestParams getEncryptDataRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        if (iTsmCallback == null || getEncryptDataRequestParams == null) {
            return -3;
        }
        int type = getEncryptDataRequestParams.getType();
        String pan = getEncryptDataRequestParams.getPan();
        if (type >= 2000 && type <= 2001) {
            if (type == 2000 && TextUtils.isEmpty(pan)) {
                return -3;
            }
            if (this.e != null) {
                if (!b(this.c.getPackageName())) {
                    return a(2, getEncryptDataRequestParams, iTsmCallback);
                }
                GetEncryptDataRequestParams getEncryptDataRequestParams2 = new GetEncryptDataRequestParams();
                if (type == 2000) {
                    getEncryptDataRequestParams2.setPan(c(pan));
                }
                getEncryptDataRequestParams2.setType(type);
                String reserve = getEncryptDataRequestParams.getReserve();
                if (c()) {
                    reserve = h(g(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    getEncryptDataRequestParams2.setReserve(c(reserve));
                }
                this.i.put(String.valueOf(this.w[2]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.w;
                    int i = iArr[2];
                    iArr[2] = i + 1;
                    int encryptData = iTsmService.getEncryptData(getEncryptDataRequestParams2, new b(this, 2, i, (byte) 0));
                    if (encryptData != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.i;
                        int[] iArr2 = this.w;
                        int i2 = iArr2[2] - 1;
                        iArr2[2] = i2;
                        hashMap.remove(String.valueOf(i2));
                    }
                    if (-2 == encryptData) {
                        return a(2, getEncryptDataRequestParams, iTsmCallback);
                    }
                    return encryptData;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            return -1;
        }
        return -3;
    }

    public synchronized int getListenerCount() {
        if (b != null) {
            return b.size();
        }
        return 0;
    }

    public synchronized int getMessageDetails(GetMessageDetailsRequestParams getMessageDetailsRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!e(com.unionpay.tsmservice.data.Constant.APK_VERSION_010017)) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(18, getMessageDetailsRequestParams, iTsmCallback);
            }
            GetMessageDetailsRequestParams getMessageDetailsRequestParams2 = new GetMessageDetailsRequestParams();
            String str = "";
            if (getMessageDetailsRequestParams != null) {
                str = getMessageDetailsRequestParams.getReserve();
                Bundle params = getMessageDetailsRequestParams.getParams();
                if (params != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("encryptData", a(params));
                    getMessageDetailsRequestParams2.setParams(bundle);
                }
            }
            getMessageDetailsRequestParams2.setReserve(c(h(g(str))));
            this.v.put(String.valueOf(this.w[18]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[18];
                iArr[18] = i2 + 1;
                int messageDetails = iTsmService.getMessageDetails(getMessageDetailsRequestParams2, new b(this, 18, i2, (byte) 0));
                if (messageDetails != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.v;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[18] - 1;
                    iArr2[18] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == messageDetails) {
                    return a(18, getMessageDetailsRequestParams, iTsmCallback);
                }
                return messageDetails;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public int getPubKey(int i, String[] strArr) throws RemoteException {
        if (strArr == null || strArr.length == 0) {
            return -3;
        }
        if (this.e != null) {
            try {
                return this.e.getPubKey(i, strArr);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        }
        return -1;
    }

    public synchronized int getSeId(GetSeIdRequestParams getSeIdRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!e("01.00.10")) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(15, getSeIdRequestParams, iTsmCallback);
            }
            GetSeIdRequestParams getSeIdRequestParams2 = new GetSeIdRequestParams();
            getSeIdRequestParams2.setReserve(c(h(g(getSeIdRequestParams != null ? getSeIdRequestParams.getReserve() : ""))));
            this.s.put(String.valueOf(this.w[15]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[15];
                iArr[15] = i2 + 1;
                int sEId = iTsmService.getSEId(getSeIdRequestParams2, new b(this, 15, i2, (byte) 0));
                if (sEId != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.s;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[15] - 1;
                    iArr2[15] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == sEId) {
                    return a(15, getSeIdRequestParams, iTsmCallback);
                }
                return sEId;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int getTransactionDetails(GetTransactionDetailsRequestParams getTransactionDetailsRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!e(com.unionpay.tsmservice.data.Constant.APK_VERSION_010017)) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(17, getTransactionDetailsRequestParams, iTsmCallback);
            }
            GetTransactionDetailsRequestParams getTransactionDetailsRequestParams2 = new GetTransactionDetailsRequestParams();
            String str = "";
            if (getTransactionDetailsRequestParams != null) {
                str = getTransactionDetailsRequestParams.getReserve();
                Bundle params = getTransactionDetailsRequestParams.getParams();
                if (params != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("encryptData", a(params));
                    getTransactionDetailsRequestParams2.setParams(bundle);
                }
            }
            getTransactionDetailsRequestParams2.setReserve(c(h(g(str))));
            this.u.put(String.valueOf(this.w[17]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[17];
                iArr[17] = i2 + 1;
                int transactionDetails = iTsmService.getTransactionDetails(getTransactionDetailsRequestParams2, new b(this, 17, i2, (byte) 0));
                if (transactionDetails != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.u;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[17] - 1;
                    iArr2[17] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == transactionDetails) {
                    return a(17, getTransactionDetailsRequestParams, iTsmCallback);
                }
                return transactionDetails;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int getVendorPayStatus(GetVendorPayStatusRequestParams getVendorPayStatusRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!e("01.00.08")) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(9, getVendorPayStatusRequestParams, iTsmCallback);
            }
            GetVendorPayStatusRequestParams getVendorPayStatusRequestParams2 = new GetVendorPayStatusRequestParams();
            getVendorPayStatusRequestParams2.setReserve(c(h(g(getVendorPayStatusRequestParams != null ? getVendorPayStatusRequestParams.getReserve() : ""))));
            this.n.put(String.valueOf(this.w[9]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[9];
                iArr[9] = i2 + 1;
                int vendorPayStatus = iTsmService.getVendorPayStatus(getVendorPayStatusRequestParams2, new b(this, 9, i2, (byte) 0));
                if (vendorPayStatus != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.n;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[9] - 1;
                    iArr2[9] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == vendorPayStatus) {
                    return a(9, getVendorPayStatusRequestParams, iTsmCallback);
                }
                return vendorPayStatus;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int getVendorPayStatusForBankApp(GetVendorPayStatusRequestParams getVendorPayStatusRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!e("01.00.09")) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(14, getVendorPayStatusRequestParams, iTsmCallback);
            }
            GetVendorPayStatusRequestParams getVendorPayStatusRequestParams2 = new GetVendorPayStatusRequestParams();
            getVendorPayStatusRequestParams2.setReserve(c(h(g(getVendorPayStatusRequestParams != null ? getVendorPayStatusRequestParams.getReserve() : ""))));
            this.r.put(String.valueOf(this.w[14]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[14];
                iArr[14] = i2 + 1;
                int vendorPayStatusForBankApp = iTsmService.getVendorPayStatusForBankApp(getVendorPayStatusRequestParams2, new b(this, 14, i2, (byte) 0));
                if (vendorPayStatusForBankApp != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.r;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[14] - 1;
                    iArr2[14] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == vendorPayStatusForBankApp) {
                    return a(14, getVendorPayStatusRequestParams, iTsmCallback);
                }
                return vendorPayStatusForBankApp;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0014, B:9:0x001a, B:10:0x0030, B:18:0x004a, B:13:0x0038, B:14:0x0040, B:15:0x0041, B:24:0x0053, B:25:0x005b, B:26:0x005c), top: B:35:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int hideKeyboard() throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            com.unionpay.tsmservice.mi.ITsmService r0 = r5.e     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L62
            android.content.Context r0 = r5.c     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L65
            boolean r0 = b(r0)     // Catch: java.lang.Throwable -> L65
            r1 = 0
            r2 = 5
            r3 = 0
            if (r0 == 0) goto L5c
            boolean r0 = r5.c()     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L41
            com.unionpay.tsmservice.mi.request.HideSafetyKeyboardRequestParams r0 = new com.unionpay.tsmservice.mi.request.HideSafetyKeyboardRequestParams     // Catch: java.lang.Throwable -> L65
            r0.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = ""
            java.lang.String r4 = g(r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = r5.h(r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = c(r4)     // Catch: java.lang.Throwable -> L65
            r0.setReserve(r4)     // Catch: java.lang.Throwable -> L65
            com.unionpay.tsmservice.mi.ITsmService r4 = r5.e     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L65
            int r0 = r4.hideSafetyKeyboard(r0)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L65
            goto L47
        L37:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L65
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L65
            r0.<init>()     // Catch: java.lang.Throwable -> L65
            throw r0     // Catch: java.lang.Throwable -> L65
        L41:
            com.unionpay.tsmservice.mi.ITsmService r0 = r5.e     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L65
            int r0 = r0.hideKeyboard()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L65
        L47:
            r4 = -2
            if (r4 != r0) goto L50
            int r0 = a(r2, r3, r1, r3, r3)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r5)
            return r0
        L50:
            monitor-exit(r5)
            return r0
        L52:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L65
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L65
            r0.<init>()     // Catch: java.lang.Throwable -> L65
            throw r0     // Catch: java.lang.Throwable -> L65
        L5c:
            int r0 = a(r2, r3, r1, r3, r3)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r5)
            return r0
        L62:
            r0 = -1
            monitor-exit(r5)
            return r0
        L65:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.tsmservice.mi.UPTsmAddon.hideKeyboard():int");
    }

    public synchronized int init(InitRequestParams initRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(0, initRequestParams, iTsmCallback);
            }
            InitRequestParams initRequestParams2 = new InitRequestParams();
            String str = "";
            if (initRequestParams != null) {
                str = initRequestParams.getReserve();
                String signature = initRequestParams.getSignature();
                if (!TextUtils.isEmpty(signature)) {
                    initRequestParams2.setSignature(c(signature));
                }
            }
            if (c()) {
                str = h(g(str));
            }
            if (!TextUtils.isEmpty(str)) {
                initRequestParams2.setReserve(c(str));
            }
            this.g.put(String.valueOf(this.w[0]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[0];
                iArr[0] = i2 + 1;
                int init = iTsmService.init(initRequestParams2, new b(this, 0, i2, (byte) 0));
                if (init != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.g;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[0] - 1;
                    iArr2[0] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == init) {
                    return a(0, initRequestParams, iTsmCallback);
                }
                return init;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public boolean isConnected() {
        return this.f;
    }

    public synchronized int onlinePaymentVerify(OnlinePaymentVerifyRequestParams onlinePaymentVerifyRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (onlinePaymentVerifyRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!e("01.00.08")) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(10, onlinePaymentVerifyRequestParams, iTsmCallback);
            }
            OnlinePaymentVerifyRequestParams onlinePaymentVerifyRequestParams2 = new OnlinePaymentVerifyRequestParams();
            Bundle params = onlinePaymentVerifyRequestParams.getParams();
            if (params != null) {
                Bundle bundle = new Bundle();
                bundle.putString("encryptData", a(params));
                onlinePaymentVerifyRequestParams2.setParams(bundle);
            }
            onlinePaymentVerifyRequestParams2.setReserve(c(h(g(onlinePaymentVerifyRequestParams.getReserve()))));
            this.o.put(String.valueOf(this.w[10]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[10];
                iArr[10] = i2 + 1;
                int onlinePaymentVerify = iTsmService.onlinePaymentVerify(onlinePaymentVerifyRequestParams2, new b(this, 10, i2, (byte) 0));
                if (onlinePaymentVerify != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.o;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[10] - 1;
                    iArr2[10] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == onlinePaymentVerify) {
                    return a(10, onlinePaymentVerifyRequestParams, iTsmCallback);
                }
                return onlinePaymentVerify;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int payResultNotify(PayResultNotifyRequestParams payResultNotifyRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (payResultNotifyRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!e("01.00.08")) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(12, payResultNotifyRequestParams, iTsmCallback);
            }
            PayResultNotifyRequestParams payResultNotifyRequestParams2 = new PayResultNotifyRequestParams();
            Bundle params = payResultNotifyRequestParams.getParams();
            if (params != null) {
                Bundle bundle = new Bundle();
                bundle.putString("encryptData", a(params));
                payResultNotifyRequestParams2.setParams(bundle);
            }
            payResultNotifyRequestParams2.setReserve(c(h(g(payResultNotifyRequestParams.getReserve()))));
            this.q.put(String.valueOf(this.w[12]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[12];
                iArr[12] = i2 + 1;
                int payResultNotify = iTsmService.payResultNotify(payResultNotifyRequestParams2, new b(this, 12, i2, (byte) 0));
                if (payResultNotify != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.q;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[12] - 1;
                    iArr2[12] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == payResultNotify) {
                    return a(12, payResultNotifyRequestParams, iTsmCallback);
                }
                return payResultNotify;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int pinRequest(PinRequestRequestParams pinRequestRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!e("01.00.08")) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(11, pinRequestRequestParams, iTsmCallback);
            }
            PinRequestRequestParams pinRequestRequestParams2 = new PinRequestRequestParams();
            String str = "";
            if (pinRequestRequestParams != null) {
                str = pinRequestRequestParams.getReserve();
                Bundle params = pinRequestRequestParams.getParams();
                if (params != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("encryptData", a(params));
                    pinRequestRequestParams2.setParams(bundle);
                }
            }
            pinRequestRequestParams2.setReserve(c(h(g(str))));
            this.p.put(String.valueOf(this.w[11]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[11];
                iArr[11] = i2 + 1;
                int pinRequest = iTsmService.pinRequest(pinRequestRequestParams2, new b(this, 11, i2, (byte) 0));
                if (pinRequest != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.p;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[11] - 1;
                    iArr2[11] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == pinRequest) {
                    return a(11, pinRequestRequestParams, iTsmCallback);
                }
                return pinRequest;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int queryVendorPayStatus(QueryVendorPayStatusRequestParams queryVendorPayStatusRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!e("01.00.07")) {
            i = -8;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(8, queryVendorPayStatusRequestParams, iTsmCallback);
            }
            QueryVendorPayStatusRequestParams queryVendorPayStatusRequestParams2 = new QueryVendorPayStatusRequestParams();
            queryVendorPayStatusRequestParams2.setReserve(c(h(g(queryVendorPayStatusRequestParams != null ? queryVendorPayStatusRequestParams.getReserve() : ""))));
            this.m.put(String.valueOf(this.w[8]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.w;
                int i2 = iArr[8];
                iArr[8] = i2 + 1;
                int queryVendorPayStatus = iTsmService.queryVendorPayStatus(queryVendorPayStatusRequestParams2, new b(this, 8, i2, (byte) 0));
                if (queryVendorPayStatus != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.m;
                    int[] iArr2 = this.w;
                    int i3 = iArr2[8] - 1;
                    iArr2[8] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == queryVendorPayStatus) {
                    return a(8, queryVendorPayStatusRequestParams, iTsmCallback);
                }
                return queryVendorPayStatus;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized void removeConnectionListener(UPTsmConnectionListener uPTsmConnectionListener) {
        if (uPTsmConnectionListener != null) {
            b.remove(uPTsmConnectionListener);
        }
    }

    public synchronized int setSafetyKeyboardBitmap(SafetyKeyboardRequestParams safetyKeyboardRequestParams) throws RemoteException {
        int i;
        if (safetyKeyboardRequestParams == null) {
            i = -3;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(3, safetyKeyboardRequestParams, (ITsmCallback) null);
            }
            String reserve = safetyKeyboardRequestParams.getReserve();
            if (c()) {
                reserve = h(g(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                safetyKeyboardRequestParams.setReserve(c(reserve));
            }
            try {
                int safetyKeyboardBitmap = this.e.setSafetyKeyboardBitmap(safetyKeyboardRequestParams);
                if (-2 == safetyKeyboardBitmap) {
                    return a(3, safetyKeyboardRequestParams, (ITsmCallback) null);
                }
                return safetyKeyboardBitmap;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int showSafetyKeyboard(SafetyKeyboardRequestParams safetyKeyboardRequestParams, int i, OnSafetyKeyboardCallback onSafetyKeyboardCallback, Context context) throws RemoteException {
        int i2;
        if (safetyKeyboardRequestParams == null || i < 2000 || i > 2002) {
            i2 = -3;
        } else if (this.e != null) {
            if (!b(this.c.getPackageName())) {
                return a(1000, safetyKeyboardRequestParams, i, onSafetyKeyboardCallback, context);
            }
            this.j.put(this.c.getPackageName(), new com.unionpay.tsmservice.mi.a(context));
            String reserve = safetyKeyboardRequestParams.getReserve();
            if (c()) {
                reserve = h(g(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                safetyKeyboardRequestParams.setReserve(c(reserve));
            }
            try {
                int showSafetyKeyboard = this.e.showSafetyKeyboard(safetyKeyboardRequestParams, i, onSafetyKeyboardCallback, new a());
                if (showSafetyKeyboard != 0) {
                    this.j.remove(this.c.getPackageName());
                }
                if (-2 == showSafetyKeyboard) {
                    return a(1000, safetyKeyboardRequestParams, i, onSafetyKeyboardCallback, context);
                }
                return showSafetyKeyboard;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i2 = -1;
        }
        return i2;
    }

    public void unbind() {
        if (this.d == null || !this.f) {
            return;
        }
        this.c.unbindService(this.d);
        this.f = false;
    }
}
