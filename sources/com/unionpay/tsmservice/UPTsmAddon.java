package com.unionpay.tsmservice;

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
import com.unionpay.tsmservice.ITsmActivityCallback;
import com.unionpay.tsmservice.ITsmCallback;
import com.unionpay.tsmservice.ITsmService;
import com.unionpay.tsmservice.data.Amount;
import com.unionpay.tsmservice.data.Constant;
import com.unionpay.tsmservice.request.AcquireSEAppListRequestParams;
import com.unionpay.tsmservice.request.ActivateVendorPayRequestParams;
import com.unionpay.tsmservice.request.AddCardToVendorPayRequestParams;
import com.unionpay.tsmservice.request.AppDataUpdateRequestParams;
import com.unionpay.tsmservice.request.AppDeleteRequestParams;
import com.unionpay.tsmservice.request.AppDownloadApplyRequestParams;
import com.unionpay.tsmservice.request.AppDownloadRequestParams;
import com.unionpay.tsmservice.request.AppLockRequestParams;
import com.unionpay.tsmservice.request.AppUnlockRequestParams;
import com.unionpay.tsmservice.request.CardListStatusChangedRequestParams;
import com.unionpay.tsmservice.request.CheckSSamsungPayRequestParams;
import com.unionpay.tsmservice.request.CloseChannelRequestParams;
import com.unionpay.tsmservice.request.ECashTopUpRequestParams;
import com.unionpay.tsmservice.request.EncryptDataRequestParams;
import com.unionpay.tsmservice.request.ExecuteCmdRequestParams;
import com.unionpay.tsmservice.request.GetAccountBalanceRequestParams;
import com.unionpay.tsmservice.request.GetAccountInfoRequestParams;
import com.unionpay.tsmservice.request.GetAppDetailRequestParams;
import com.unionpay.tsmservice.request.GetAppListRequestParams;
import com.unionpay.tsmservice.request.GetAppStatusRequestParams;
import com.unionpay.tsmservice.request.GetAssociatedAppRequestParams;
import com.unionpay.tsmservice.request.GetCardInfoBySpayRequestParams;
import com.unionpay.tsmservice.request.GetCardInfoRequestParams;
import com.unionpay.tsmservice.request.GetDefaultCardRequestParams;
import com.unionpay.tsmservice.request.GetEncryptDataRequestParams;
import com.unionpay.tsmservice.request.GetMessageDetailsRequestParams;
import com.unionpay.tsmservice.request.GetSMSAuthCodeRequestParams;
import com.unionpay.tsmservice.request.GetSeAppListRequestParams;
import com.unionpay.tsmservice.request.GetSeIdRequestParams;
import com.unionpay.tsmservice.request.GetTransElementsRequestParams;
import com.unionpay.tsmservice.request.GetTransRecordRequestParams;
import com.unionpay.tsmservice.request.GetTransactionDetailsRequestParams;
import com.unionpay.tsmservice.request.GetVendorPayStatusRequestParams;
import com.unionpay.tsmservice.request.HideAppApplyRequestParams;
import com.unionpay.tsmservice.request.InitRequestParams;
import com.unionpay.tsmservice.request.OnlinePaymentVerifyRequestParams;
import com.unionpay.tsmservice.request.OpenChannelRequestParams;
import com.unionpay.tsmservice.request.PreDownloadRequestParams;
import com.unionpay.tsmservice.request.QueryVendorPayStatusRequestParams;
import com.unionpay.tsmservice.request.RequestParams;
import com.unionpay.tsmservice.request.SafetyKeyboardRequestParams;
import com.unionpay.tsmservice.request.SendApduRequestParams;
import com.unionpay.tsmservice.request.SendCustomDataRequestParams;
import com.unionpay.tsmservice.request.SetDefaultCardRequestParams;
import com.unionpay.tsmservice.request.SetSamsungDefWalletRequestParams;
import com.unionpay.tsmservice.request.UniteRequestParams;
import com.unionpay.tsmservice.utils.IUPJniInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
    private int g = 1;
    private boolean h = false;
    private HashMap<String, ITsmCallback> i = new HashMap<>();
    private HashMap<String, ITsmCallback> j = new HashMap<>();
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
    private HashMap<String, ITsmCallback> w = new HashMap<>();
    private HashMap<String, ITsmCallback> x = new HashMap<>();
    private HashMap<String, ITsmCallback> y = new HashMap<>();
    private HashMap<String, ITsmCallback> z = new HashMap<>();
    private HashMap<String, ITsmCallback> A = new HashMap<>();
    private HashMap<String, ITsmCallback> B = new HashMap<>();
    private HashMap<String, ITsmCallback> C = new HashMap<>();
    private HashMap<String, ITsmCallback> D = new HashMap<>();
    private HashMap<String, ITsmCallback> E = new HashMap<>();
    private HashMap<String, ITsmCallback> F = new HashMap<>();
    private HashMap<String, ITsmCallback> G = new HashMap<>();
    private HashMap<String, ITsmCallback> H = new HashMap<>();
    private HashMap<String, ITsmCallback> I = new HashMap<>();
    private HashMap<String, ITsmCallback> J = new HashMap<>();
    private HashMap<String, ITsmCallback> K = new HashMap<>();
    private HashMap<String, ITsmCallback> L = new HashMap<>();
    private HashMap<String, ITsmCallback> M = new HashMap<>();
    private HashMap<String, ITsmCallback> N = new HashMap<>();
    private HashMap<String, ITsmCallback> O = new HashMap<>();
    private HashMap<String, ITsmCallback> P = new HashMap<>();
    private HashMap<String, ITsmCallback> Q = new HashMap<>();
    private HashMap<String, ITsmCallback> R = new HashMap<>();
    private HashMap<String, ITsmCallback> S = new HashMap<>();
    private HashMap<String, ITsmCallback> T = new HashMap<>();
    private HashMap<String, ITsmCallback> U = new HashMap<>();
    private HashMap<String, ITsmCallback> V = new HashMap<>();
    private HashMap<String, ITsmCallback> W = new HashMap<>();
    private HashMap<String, ITsmCallback> X = new HashMap<>();
    private HashMap<String, ITsmActivityCallback> Y = new HashMap<>();
    private final Handler.Callback aa = new Handler.Callback() { // from class: com.unionpay.tsmservice.UPTsmAddon.1
        @Override // android.os.Handler.Callback
        public final synchronized boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    UPTsmAddon.this.a();
                    return true;
                case 1:
                    UPTsmAddon.this.b();
                    return true;
                default:
                    return false;
            }
        }
    };
    private final Handler ab = new Handler(Looper.getMainLooper(), this.aa);
    private int[] Z = new int[47];

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

        @Override // com.unionpay.tsmservice.ITsmActivityCallback
        public final void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
            UPTsmAddon.a((ITsmActivityCallback) UPTsmAddon.b(UPTsmAddon.this, this.b).get(UPTsmAddon.e(UPTsmAddon.this)), str, str2, i, bundle);
            UPTsmAddon.b(UPTsmAddon.this, this.b).remove(UPTsmAddon.e(UPTsmAddon.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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

        @Override // com.unionpay.tsmservice.ITsmCallback
        public final void onError(String str, String str2) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("errorCode", str);
            bundle.putString("errorDesc", str2);
            UPTsmAddon.a((ITsmCallback) UPTsmAddon.a(UPTsmAddon.this, this.b).get(String.valueOf(this.c)), bundle);
            UPTsmAddon.a(UPTsmAddon.this, this.b).remove(String.valueOf(this.c));
            if (UPTsmAddon.a(UPTsmAddon.this, this.b).isEmpty()) {
                UPTsmAddon.this.Z[this.b] = 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        @Override // com.unionpay.tsmservice.ITsmCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onResult(android.os.Bundle r7) throws android.os.RemoteException {
            /*
                Method dump skipped, instructions count: 454
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unionpay.tsmservice.UPTsmAddon.b.onResult(android.os.Bundle):void");
        }
    }

    static {
        try {
            System.loadLibrary("uptsmaddon");
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

    private static int a(int i, RequestParams requestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        return new SessionKeyReExchange(a, i, requestParams, iTsmCallback, iTsmProgressCallback).reExchangeKey();
    }

    private static int a(int i, SafetyKeyboardRequestParams safetyKeyboardRequestParams, int i2, OnSafetyKeyboardCallback onSafetyKeyboardCallback, Context context) throws RemoteException {
        return new SessionKeyReExchange(a, i, safetyKeyboardRequestParams, i2, onSafetyKeyboardCallback, context).reExchangeKey();
    }

    private String a(Bundle bundle) {
        String str = "";
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        if (marshall != null && marshall.length != 0) {
            str = b(Base64.encodeToString(marshall, 0));
        }
        obtain.recycle();
        return str;
    }

    static /* synthetic */ HashMap a(UPTsmAddon uPTsmAddon, int i) {
        switch (i) {
            case 0:
                return uPTsmAddon.i;
            case 1:
                return uPTsmAddon.j;
            case 2:
                return uPTsmAddon.l;
            case 3:
                return uPTsmAddon.k;
            case 4:
                return uPTsmAddon.n;
            case 5:
                return uPTsmAddon.m;
            case 6:
                return uPTsmAddon.A;
            case 7:
                return uPTsmAddon.u;
            case 8:
                return uPTsmAddon.v;
            case 9:
                return uPTsmAddon.o;
            case 10:
                return uPTsmAddon.t;
            case 11:
                return uPTsmAddon.r;
            case 12:
                return uPTsmAddon.z;
            case 13:
                return uPTsmAddon.y;
            case 14:
                return uPTsmAddon.E;
            case 15:
                return uPTsmAddon.p;
            case 16:
                return uPTsmAddon.C;
            case 17:
                return uPTsmAddon.D;
            case 18:
                return uPTsmAddon.q;
            case 19:
                return uPTsmAddon.s;
            case 20:
                return uPTsmAddon.w;
            case 21:
                return uPTsmAddon.F;
            case 22:
                return uPTsmAddon.x;
            case 23:
                return uPTsmAddon.B;
            case 24:
                return uPTsmAddon.G;
            case 25:
                return uPTsmAddon.H;
            case 26:
            case 27:
            case 32:
            case 33:
            case 34:
            default:
                return null;
            case 28:
                return uPTsmAddon.I;
            case 29:
                return uPTsmAddon.J;
            case 30:
                return uPTsmAddon.K;
            case 31:
                return uPTsmAddon.L;
            case 35:
                return uPTsmAddon.M;
            case 36:
                return uPTsmAddon.N;
            case 37:
                return uPTsmAddon.O;
            case 38:
                return uPTsmAddon.P;
            case 39:
                return uPTsmAddon.Q;
            case 40:
                return uPTsmAddon.R;
            case 41:
                return uPTsmAddon.S;
            case 42:
                return uPTsmAddon.T;
            case 43:
                return uPTsmAddon.U;
            case 44:
                return uPTsmAddon.V;
            case 45:
                return uPTsmAddon.W;
            case 46:
                return uPTsmAddon.X;
        }
    }

    private static HashMap<String, String> a(HashMap<String, String> hashMap) {
        String str;
        if (hashMap == null) {
            return new HashMap<>();
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        for (String str2 : hashMap.keySet()) {
            if (str2 != null && (str = hashMap.get(str2)) != null) {
                hashMap2.put(new String(str2), new String(str));
            }
        }
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        if (b != null && b.size() > 0) {
            Iterator<UPTsmConnectionListener> it = b.iterator();
            while (it.hasNext()) {
                UPTsmConnectionListener next = it.next();
                if (next != null) {
                    next.onTsmConnected();
                }
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

    private static boolean a(String str) {
        try {
            return IUPJniInterface.cSKV(str);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            return false;
        }
    }

    private String b(String str) {
        try {
            return IUPJniInterface.eMG(str, this.g);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            return "";
        }
    }

    static /* synthetic */ HashMap b(UPTsmAddon uPTsmAddon, int i) {
        if (i != 1000) {
            return null;
        }
        return uPTsmAddon.Y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        if (b != null && b.size() > 0) {
            Iterator<UPTsmConnectionListener> it = b.iterator();
            while (it.hasNext()) {
                UPTsmConnectionListener next = it.next();
                if (next != null) {
                    next.onTsmDisconnected();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        try {
            return IUPJniInterface.dMG(str, this.g);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            return "";
        }
    }

    private boolean c() {
        String e = e("com.unionpay.tsmservice");
        if (e == null || e.compareTo(Constant.SUPPORTED_MIN_APK_VERSION) < 0) {
            return false;
        }
        if (e.compareTo(Constant.APK_VERSION_010018) >= 0) {
            this.g = 1;
            this.h = true;
            return true;
        } else if (e.compareTo(Constant.APK_VERSION_010012) >= 0 && e.compareTo(Constant.APK_VERSION_010016) <= 0) {
            this.g = 2;
            this.h = false;
            return true;
        } else if (e.compareTo(Constant.APK_VERSION_010017) == 0 || e.compareTo(Constant.SUPPORTED_MIN_APK_VERSION) == 0) {
            this.g = 1;
            this.h = false;
            return true;
        } else {
            return false;
        }
    }

    private boolean d(String str) {
        String e = e("com.unionpay.tsmservice");
        return e != null && e.compareTo(str) >= 0;
    }

    static /* synthetic */ String e(UPTsmAddon uPTsmAddon) {
        return uPTsmAddon.c.getPackageName();
    }

    private String e(String str) {
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

    private static String f(String str) {
        try {
            JSONObject jSONObject = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
            jSONObject.put("jarVersionCode", 52);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }

    private String g(String str) {
        try {
            JSONObject jSONObject = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
            jSONObject.put("packageName", this.c.getPackageName());
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

    public synchronized int acquireSEAppList(AcquireSEAppListRequestParams acquireSEAppListRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!d("01.00.28")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(42, acquireSEAppListRequestParams, iTsmCallback);
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
                if (this.h) {
                    str = g(f(str));
                }
                if (!TextUtils.isEmpty(str)) {
                    acquireSEAppListRequestParams2.setReserve(b(str));
                }
                this.T.put(String.valueOf(this.Z[42]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[42];
                    iArr[42] = i2 + 1;
                    int acquireSEAppList = iTsmService.acquireSEAppList(acquireSEAppListRequestParams2, new b(this, 42, i2, (byte) 0));
                    if (acquireSEAppList != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.T;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[42] - 1;
                        iArr2[42] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == acquireSEAppList) {
                        return a(42, acquireSEAppListRequestParams, iTsmCallback);
                    }
                    return acquireSEAppList;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    public synchronized int activateVendorPay(ActivateVendorPayRequestParams activateVendorPayRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!d("01.00.20")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(37, activateVendorPayRequestParams, iTsmCallback);
                }
                ActivateVendorPayRequestParams activateVendorPayRequestParams2 = new ActivateVendorPayRequestParams();
                String reserve = activateVendorPayRequestParams != null ? activateVendorPayRequestParams.getReserve() : "";
                if (this.h) {
                    reserve = g(f(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    activateVendorPayRequestParams2.setReserve(b(reserve));
                }
                this.O.put(String.valueOf(this.Z[37]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[37];
                    iArr[37] = i2 + 1;
                    int activateVendorPay = iTsmService.activateVendorPay(activateVendorPayRequestParams2, new b(this, 37, i2, (byte) 0));
                    if (activateVendorPay != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.O;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[37] - 1;
                        iArr2[37] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == activateVendorPay) {
                        return a(37, activateVendorPayRequestParams, iTsmCallback);
                    }
                    return activateVendorPay;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    public synchronized int addCardToVendorPay(AddCardToVendorPayRequestParams addCardToVendorPayRequestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        int i;
        if (addCardToVendorPayRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!d("01.00.20")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(38, addCardToVendorPayRequestParams, iTsmCallback);
                }
                AddCardToVendorPayRequestParams addCardToVendorPayRequestParams2 = new AddCardToVendorPayRequestParams();
                Bundle params = addCardToVendorPayRequestParams.getParams();
                if (params != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("encryptData", a(params));
                    addCardToVendorPayRequestParams2.setParams(bundle);
                }
                String reserve = addCardToVendorPayRequestParams.getReserve();
                if (this.h) {
                    reserve = g(f(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    addCardToVendorPayRequestParams2.setReserve(b(reserve));
                }
                this.P.put(String.valueOf(this.Z[38]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[38];
                    iArr[38] = i2 + 1;
                    int addCardToVendorPay = iTsmService.addCardToVendorPay(addCardToVendorPayRequestParams2, new b(this, 38, i2, (byte) 0), iTsmProgressCallback);
                    if (addCardToVendorPay != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.P;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[38] - 1;
                        iArr2[38] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == addCardToVendorPay) {
                        return a(38, addCardToVendorPayRequestParams, iTsmCallback, iTsmProgressCallback);
                    }
                    return addCardToVendorPay;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    public synchronized void addConnectionListener(UPTsmConnectionListener uPTsmConnectionListener) {
        if (uPTsmConnectionListener != null) {
            b.add(uPTsmConnectionListener);
        }
    }

    @Deprecated
    public synchronized int appDataUpdate(AppDataUpdateRequestParams appDataUpdateRequestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        int i;
        if (appDataUpdateRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(18, appDataUpdateRequestParams, iTsmCallback, iTsmProgressCallback);
            }
            AppDataUpdateRequestParams appDataUpdateRequestParams2 = new AppDataUpdateRequestParams();
            String reserve = appDataUpdateRequestParams.getReserve();
            AppID appID = appDataUpdateRequestParams.getAppID();
            if (!TextUtils.isEmpty(reserve)) {
                appDataUpdateRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    appDataUpdateRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            try {
                int appDataUpdate = this.e.appDataUpdate(appDataUpdateRequestParams2, new b(this, 18, this.Z[18], (byte) 0), iTsmProgressCallback);
                if (-2 == appDataUpdate) {
                    return a(18, appDataUpdateRequestParams, iTsmCallback, iTsmProgressCallback);
                }
                if (appDataUpdate == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.q;
                    int[] iArr = this.Z;
                    int i2 = iArr[18];
                    iArr[18] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return appDataUpdate;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int appDelete(AppDeleteRequestParams appDeleteRequestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        int i;
        if (appDeleteRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(17, appDeleteRequestParams, iTsmCallback, iTsmProgressCallback);
            }
            AppDeleteRequestParams appDeleteRequestParams2 = new AppDeleteRequestParams();
            String reserve = appDeleteRequestParams.getReserve();
            AppID appID = appDeleteRequestParams.getAppID();
            if (!TextUtils.isEmpty(reserve)) {
                appDeleteRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    appDeleteRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            HashMap hashMap = (HashMap) appDeleteRequestParams.getParams();
            if (hashMap == null) {
                try {
                    int appDelete = this.e.appDelete(appDeleteRequestParams2, new b(this, 17, this.Z[17], (byte) 0), iTsmProgressCallback);
                    if (-2 == appDelete) {
                        return a(17, appDeleteRequestParams, iTsmCallback, iTsmProgressCallback);
                    }
                    if (appDelete == 0) {
                        HashMap<String, ITsmCallback> hashMap2 = this.D;
                        int[] iArr = this.Z;
                        int i2 = iArr[17];
                        iArr[17] = i2 + 1;
                        hashMap2.put(String.valueOf(i2), iTsmCallback);
                    }
                    return appDelete;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            HashMap<String, String> a2 = a(hashMap);
            String str = a2.get(Constant.KEY_CARD_HOLDER_NAME);
            String str2 = a2.get(Constant.KEY_ID_TYPE);
            String str3 = a2.get(Constant.KEY_ID_NO);
            String str4 = a2.get("pan");
            String str5 = a2.get(Constant.KEY_PIN);
            String str6 = a2.get(Constant.KEY_EXPIRY_DATE);
            String str7 = a2.get(Constant.KEY_CVN2);
            String str8 = a2.get(Constant.KEY_PHONE_NUMBER);
            String str9 = a2.get(Constant.KEY_SMS_AUTH_CODE);
            String str10 = a2.get(Constant.KEY_BALANCE);
            String str11 = a2.get("cardType");
            if (!TextUtils.isEmpty(str)) {
                a2.put(Constant.KEY_CARD_HOLDER_NAME, b(str));
            }
            if (!TextUtils.isEmpty(str2)) {
                a2.put(Constant.KEY_ID_TYPE, b(str2));
            }
            if (!TextUtils.isEmpty(str3)) {
                a2.put(Constant.KEY_ID_NO, b(str3));
            }
            if (!TextUtils.isEmpty(str4)) {
                a2.put("pan", b(str4));
            }
            if (!TextUtils.isEmpty(str5)) {
                a2.put(Constant.KEY_PIN, str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                a2.put(Constant.KEY_EXPIRY_DATE, b(str6));
            }
            if (!TextUtils.isEmpty(str7)) {
                a2.put(Constant.KEY_CVN2, b(str7));
            }
            if (!TextUtils.isEmpty(str8)) {
                a2.put(Constant.KEY_PHONE_NUMBER, b(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                a2.put(Constant.KEY_SMS_AUTH_CODE, b(str9));
            }
            if (!TextUtils.isEmpty(str10)) {
                a2.put(Constant.KEY_BALANCE, b(str10));
            }
            if (!TextUtils.isEmpty(str11)) {
                a2.put("cardType", b(str11));
            }
            appDeleteRequestParams2.setParams(a2);
            try {
                int appDelete2 = this.e.appDelete(appDeleteRequestParams2, new b(this, 17, this.Z[17], (byte) 0), iTsmProgressCallback);
                if (-2 == appDelete2) {
                    return a(17, appDeleteRequestParams, iTsmCallback, iTsmProgressCallback);
                }
                if (appDelete2 == 0) {
                    HashMap<String, ITsmCallback> hashMap3 = this.D;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[17];
                    iArr2[17] = i3 + 1;
                    hashMap3.put(String.valueOf(i3), iTsmCallback);
                }
                return appDelete2;
            } catch (Exception e2) {
                e2.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int appDownload(AppDownloadRequestParams appDownloadRequestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        int i;
        if (appDownloadRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(16, appDownloadRequestParams, iTsmCallback, iTsmProgressCallback);
            }
            AppDownloadRequestParams appDownloadRequestParams2 = new AppDownloadRequestParams();
            String reserve = appDownloadRequestParams.getReserve();
            AppID appID = appDownloadRequestParams.getAppID();
            String appName = appDownloadRequestParams.getAppName();
            if (!TextUtils.isEmpty(reserve)) {
                appDownloadRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    appDownloadRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            if (!TextUtils.isEmpty(appName)) {
                appDownloadRequestParams2.setAppName(b(appName));
            }
            try {
                int appDownload = this.e.appDownload(appDownloadRequestParams2, new b(this, 16, this.Z[16], (byte) 0), iTsmProgressCallback);
                if (-2 == appDownload) {
                    return a(16, appDownloadRequestParams, iTsmCallback, iTsmProgressCallback);
                }
                if (appDownload == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.C;
                    int[] iArr = this.Z;
                    int i2 = iArr[16];
                    iArr[16] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return appDownload;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int appDownloadApply(AppDownloadApplyRequestParams appDownloadApplyRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (appDownloadApplyRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(15, appDownloadApplyRequestParams, iTsmCallback);
            }
            AppDownloadApplyRequestParams appDownloadApplyRequestParams2 = new AppDownloadApplyRequestParams();
            String reserve = appDownloadApplyRequestParams.getReserve();
            AppID appID = appDownloadApplyRequestParams.getAppID();
            if (!TextUtils.isEmpty(reserve)) {
                appDownloadApplyRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    appDownloadApplyRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            HashMap hashMap = (HashMap) appDownloadApplyRequestParams.getParams();
            if (hashMap == null) {
                try {
                    int appDownloadApply = this.e.appDownloadApply(appDownloadApplyRequestParams2, new b(this, 15, this.Z[15], (byte) 0));
                    if (-2 == appDownloadApply) {
                        return a(15, appDownloadApplyRequestParams, iTsmCallback);
                    }
                    if (appDownloadApply == 0) {
                        HashMap<String, ITsmCallback> hashMap2 = this.p;
                        int[] iArr = this.Z;
                        int i2 = iArr[15];
                        iArr[15] = i2 + 1;
                        hashMap2.put(String.valueOf(i2), iTsmCallback);
                    }
                    return appDownloadApply;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            HashMap<String, String> a2 = a(hashMap);
            String str = a2.get(Constant.KEY_ACCOUNT_LIMIT);
            String str2 = a2.get(Constant.KEY_ACCOUNT_TYPE);
            String str3 = a2.get(Constant.KEY_CARD_HOLDER_NAME);
            String str4 = a2.get(Constant.KEY_ID_TYPE);
            String str5 = a2.get(Constant.KEY_ID_NO);
            String str6 = a2.get("pan");
            String str7 = a2.get(Constant.KEY_PIN);
            String str8 = a2.get(Constant.KEY_EXPIRY_DATE);
            String str9 = a2.get(Constant.KEY_CVN2);
            String str10 = a2.get(Constant.KEY_PHONE_NUMBER);
            String str11 = a2.get(Constant.KEY_SMS_AUTH_CODE);
            String str12 = a2.get("cardType");
            if (!TextUtils.isEmpty(str)) {
                a2.put(Constant.KEY_ACCOUNT_LIMIT, b(str));
            }
            if (!TextUtils.isEmpty(str2)) {
                a2.put(Constant.KEY_ACCOUNT_TYPE, b(str2));
            }
            if (!TextUtils.isEmpty(str3)) {
                a2.put(Constant.KEY_CARD_HOLDER_NAME, b(str3));
            }
            if (!TextUtils.isEmpty(str4)) {
                a2.put(Constant.KEY_ID_TYPE, b(str4));
            }
            if (!TextUtils.isEmpty(str5)) {
                a2.put(Constant.KEY_ID_NO, b(str5));
            }
            if (!TextUtils.isEmpty(str6)) {
                a2.put("pan", b(str6));
            }
            if (!TextUtils.isEmpty(str7)) {
                a2.put(Constant.KEY_PIN, str7);
            }
            if (!TextUtils.isEmpty(str8)) {
                a2.put(Constant.KEY_EXPIRY_DATE, b(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                a2.put(Constant.KEY_CVN2, b(str9));
            }
            if (!TextUtils.isEmpty(str10)) {
                a2.put(Constant.KEY_PHONE_NUMBER, b(str10));
            }
            if (!TextUtils.isEmpty(str11)) {
                a2.put(Constant.KEY_SMS_AUTH_CODE, b(str11));
            }
            if (!TextUtils.isEmpty(str12)) {
                a2.put("cardType", b(str12));
            }
            appDownloadApplyRequestParams2.setParams(a2);
            try {
                int appDownloadApply2 = this.e.appDownloadApply(appDownloadApplyRequestParams2, new b(this, 15, this.Z[15], (byte) 0));
                if (-2 == appDownloadApply2) {
                    return a(15, appDownloadApplyRequestParams, iTsmCallback);
                }
                if (appDownloadApply2 == 0) {
                    HashMap<String, ITsmCallback> hashMap3 = this.p;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[15];
                    iArr2[15] = i3 + 1;
                    hashMap3.put(String.valueOf(i3), iTsmCallback);
                }
                return appDownloadApply2;
            } catch (Exception e2) {
                e2.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int appLock(AppLockRequestParams appLockRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (appLockRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(26, appLockRequestParams, iTsmCallback);
            }
            AppLockRequestParams appLockRequestParams2 = new AppLockRequestParams();
            String reserve = appLockRequestParams.getReserve();
            AppID appID = appLockRequestParams.getAppID();
            if (!TextUtils.isEmpty(reserve)) {
                appLockRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    appLockRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            try {
                int appLock = this.e.appLock(appLockRequestParams2, iTsmCallback);
                if (-2 == appLock) {
                    return a(26, appLockRequestParams, iTsmCallback);
                }
                return appLock;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int appUnlock(AppUnlockRequestParams appUnlockRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (appUnlockRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(27, appUnlockRequestParams, iTsmCallback);
            }
            AppUnlockRequestParams appUnlockRequestParams2 = new AppUnlockRequestParams();
            String reserve = appUnlockRequestParams.getReserve();
            AppID appID = appUnlockRequestParams.getAppID();
            if (!TextUtils.isEmpty(reserve)) {
                appUnlockRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    appUnlockRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            try {
                int appUnlock = this.e.appUnlock(appUnlockRequestParams2, iTsmCallback);
                if (-2 == appUnlock) {
                    return a(27, appUnlockRequestParams, iTsmCallback);
                }
                return appUnlock;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public boolean bind() {
        try {
            if (this.d == null) {
                this.d = new ServiceConnection() { // from class: com.unionpay.tsmservice.UPTsmAddon.2
                    @Override // android.content.ServiceConnection
                    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        UPTsmAddon.this.f = true;
                        UPTsmAddon.this.e = ITsmService.Stub.asInterface(iBinder);
                        UPTsmAddon.this.ab.sendEmptyMessage(0);
                    }

                    @Override // android.content.ServiceConnection
                    public final synchronized void onServiceDisconnected(ComponentName componentName) {
                        UPTsmAddon.this.f = false;
                        UPTsmAddon.this.e = null;
                        UPTsmAddon.this.ab.sendEmptyMessage(1);
                    }
                };
            }
            if (this.f) {
                return true;
            }
            Intent intent = new Intent("com.unionpay.tsmservice.UPTsmService");
            intent.setPackage("com.unionpay.tsmservice");
            return this.c.bindService(intent, this.d, 1);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public synchronized int cardListStatusChanged(CardListStatusChangedRequestParams cardListStatusChangedRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!d("01.00.14")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(35, cardListStatusChangedRequestParams, iTsmCallback);
                }
                CardListStatusChangedRequestParams cardListStatusChangedRequestParams2 = new CardListStatusChangedRequestParams();
                String reserve = cardListStatusChangedRequestParams != null ? cardListStatusChangedRequestParams.getReserve() : "";
                if (this.h) {
                    reserve = g(f(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    cardListStatusChangedRequestParams2.setReserve(b(reserve));
                }
                this.M.put(String.valueOf(this.Z[35]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[35];
                    iArr[35] = i2 + 1;
                    int cardListStatusChanged = iTsmService.cardListStatusChanged(cardListStatusChangedRequestParams2, new b(this, 35, i2, (byte) 0));
                    if (cardListStatusChanged != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.M;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[35] - 1;
                        iArr2[35] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == cardListStatusChanged) {
                        return a(35, cardListStatusChangedRequestParams, iTsmCallback);
                    }
                    return cardListStatusChanged;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    public synchronized int checkSSamsungPay(CheckSSamsungPayRequestParams checkSSamsungPayRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (checkSSamsungPayRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(29, checkSSamsungPayRequestParams, iTsmCallback);
            }
            CheckSSamsungPayRequestParams checkSSamsungPayRequestParams2 = new CheckSSamsungPayRequestParams();
            String reserve = checkSSamsungPayRequestParams.getReserve();
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                checkSSamsungPayRequestParams2.setReserve(b(reserve));
            }
            this.J.put(String.valueOf(this.Z[29]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i2 = iArr[29];
                iArr[29] = i2 + 1;
                int checkSSamsungPay = iTsmService.checkSSamsungPay(checkSSamsungPayRequestParams2, new b(this, 29, i2, (byte) 0));
                if (checkSSamsungPay != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.J;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[29] - 1;
                    iArr2[29] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == checkSSamsungPay) {
                    return a(29, checkSSamsungPayRequestParams, iTsmCallback);
                }
                return checkSSamsungPay;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x000b, B:13:0x0014, B:15:0x0018, B:17:0x0027, B:19:0x002f, B:21:0x003a, B:22:0x0042, B:24:0x0048, B:25:0x004f, B:28:0x0057, B:29:0x005f, B:33:0x0069, B:30:0x0060, B:39:0x0072, B:40:0x007a, B:41:0x007b), top: B:49:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int clearEncryptData(int r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r6 < r0) goto L86
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r6 <= r0) goto Lb
            goto L86
        Lb:
            boolean r0 = r5.c()     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L14
            r6 = -8
        L12:
            monitor-exit(r5)
            return r6
        L14:
            com.unionpay.tsmservice.ITsmService r0 = r5.e     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L81
            android.content.Context r0 = r5.c     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L83
            boolean r0 = a(r0)     // Catch: java.lang.Throwable -> L83
            r1 = 33
            r2 = 0
            if (r0 == 0) goto L7b
            java.lang.String r0 = "01.00.24"
            boolean r0 = r5.d(r0)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L60
            com.unionpay.tsmservice.request.ClearEncryptDataRequestParams r0 = new com.unionpay.tsmservice.request.ClearEncryptDataRequestParams     // Catch: java.lang.Throwable -> L83
            r0.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = ""
            boolean r4 = r5.h     // Catch: java.lang.Throwable -> L83
            if (r4 == 0) goto L42
            java.lang.String r3 = f(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = r5.g(r3)     // Catch: java.lang.Throwable -> L83
        L42:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L83
            if (r4 != 0) goto L4f
            java.lang.String r3 = r5.b(r3)     // Catch: java.lang.Throwable -> L83
            r0.setReserve(r3)     // Catch: java.lang.Throwable -> L83
        L4f:
            com.unionpay.tsmservice.ITsmService r3 = r5.e     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L83
            int r0 = r3.clearKeyboardEncryptData(r0, r6)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L83
            goto L66
        L56:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L83
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L83
            r6.<init>()     // Catch: java.lang.Throwable -> L83
            throw r6     // Catch: java.lang.Throwable -> L83
        L60:
            com.unionpay.tsmservice.ITsmService r0 = r5.e     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L83
            int r0 = r0.clearEncryptData(r6)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L83
        L66:
            r3 = -2
            if (r3 != r0) goto L6f
            int r6 = a(r1, r2, r6, r2, r2)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r5)
            return r6
        L6f:
            monitor-exit(r5)
            return r0
        L71:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L83
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L83
            r6.<init>()     // Catch: java.lang.Throwable -> L83
            throw r6     // Catch: java.lang.Throwable -> L83
        L7b:
            int r6 = a(r1, r2, r6, r2, r2)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r5)
            return r6
        L81:
            r6 = -1
            goto L12
        L83:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L86:
            r6 = -3
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.tsmservice.UPTsmAddon.clearEncryptData(int):int");
    }

    public synchronized int closeChannel(CloseChannelRequestParams closeChannelRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (closeChannelRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        String channel = closeChannelRequestParams.getChannel();
        if (TextUtils.isEmpty(channel)) {
            return -3;
        }
        if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(21, closeChannelRequestParams, iTsmCallback);
            }
            String b2 = b(channel);
            CloseChannelRequestParams closeChannelRequestParams2 = new CloseChannelRequestParams();
            closeChannelRequestParams2.setChannel(b2);
            String reserve = closeChannelRequestParams.getReserve();
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                closeChannelRequestParams2.setReserve(b(reserve));
            }
            this.F.put(String.valueOf(this.Z[21]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i2 = iArr[21];
                iArr[21] = i2 + 1;
                int closeChannel = iTsmService.closeChannel(closeChannelRequestParams2, new b(this, 21, i2, (byte) 0));
                if (closeChannel != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.F;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[21] - 1;
                    iArr2[21] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == closeChannel) {
                    return a(21, closeChannelRequestParams, iTsmCallback);
                }
                return closeChannel;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int createSSD(UniteRequestParams uniteRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!d("01.00.38")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(46, uniteRequestParams, iTsmCallback);
                }
                UniteRequestParams uniteRequestParams2 = new UniteRequestParams();
                if (uniteRequestParams == null) {
                    uniteRequestParams = new UniteRequestParams();
                }
                Bundle params = uniteRequestParams.getParams();
                if (params != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("encryptData", a(params));
                    uniteRequestParams2.setParams(bundle);
                }
                String reserve = uniteRequestParams.getReserve();
                if (this.h) {
                    reserve = g(f(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    uniteRequestParams2.setReserve(b(reserve));
                }
                this.X.put(String.valueOf(this.Z[46]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[46];
                    iArr[46] = i2 + 1;
                    int createSSD = iTsmService.createSSD(uniteRequestParams2, new b(this, 46, i2, (byte) 0));
                    if (createSSD != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.X;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[46] - 1;
                        iArr2[46] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == createSSD) {
                        return a(46, uniteRequestParams, iTsmCallback);
                    }
                    return createSSD;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int eCashTopUp(ECashTopUpRequestParams eCashTopUpRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (eCashTopUpRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(19, eCashTopUpRequestParams, iTsmCallback);
            }
            ECashTopUpRequestParams eCashTopUpRequestParams2 = new ECashTopUpRequestParams();
            String reserve = eCashTopUpRequestParams.getReserve();
            AppID appID = eCashTopUpRequestParams.getAppID();
            String type = eCashTopUpRequestParams.getType();
            String amount = eCashTopUpRequestParams.getAmount();
            if (!TextUtils.isEmpty(reserve)) {
                eCashTopUpRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    eCashTopUpRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            String encrpytPin = eCashTopUpRequestParams.getEncrpytPin();
            if (!TextUtils.isEmpty(encrpytPin)) {
                eCashTopUpRequestParams2.setEncrpytPin(encrpytPin);
            }
            if (!TextUtils.isEmpty(type)) {
                eCashTopUpRequestParams2.setType(b(type));
            }
            if (!TextUtils.isEmpty(amount)) {
                eCashTopUpRequestParams2.setAmount(b(amount));
            }
            try {
                int eCashTopUp = this.e.eCashTopUp(eCashTopUpRequestParams2, new b(this, 19, this.Z[19], (byte) 0));
                if (-2 == eCashTopUp) {
                    return a(19, eCashTopUpRequestParams, iTsmCallback);
                }
                if (eCashTopUp == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.s;
                    int[] iArr = this.Z;
                    int i2 = iArr[19];
                    iArr[19] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return eCashTopUp;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int encryptData(EncryptDataRequestParams encryptDataRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (encryptDataRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(23, encryptDataRequestParams, iTsmCallback);
            }
            EncryptDataRequestParams encryptDataRequestParams2 = new EncryptDataRequestParams();
            String reserve = encryptDataRequestParams.getReserve();
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                encryptDataRequestParams2.setReserve(b(reserve));
            }
            ArrayList arrayList = (ArrayList) encryptDataRequestParams.getData();
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 0) {
                    return -3;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = (String) arrayList.get(i2);
                    if (!TextUtils.isEmpty(str)) {
                        arrayList2.add(b(str));
                    }
                }
                encryptDataRequestParams2.setData(arrayList2);
            }
            this.B.put(String.valueOf(this.Z[23]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i3 = iArr[23];
                iArr[23] = i3 + 1;
                int encryptData = iTsmService.encryptData(encryptDataRequestParams2, new b(this, 23, i3, (byte) 0));
                if (encryptData != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.B;
                    int[] iArr2 = this.Z;
                    int i4 = iArr2[23] - 1;
                    iArr2[23] = i4;
                    hashMap.remove(String.valueOf(i4));
                }
                if (-2 == encryptData) {
                    return a(23, encryptDataRequestParams, iTsmCallback);
                }
                return encryptData;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public int exchangeKey(String str, String[] strArr) throws RemoteException {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length == 0) {
            return -3;
        }
        if (c()) {
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
        return -8;
    }

    public synchronized int executeCmd(ExecuteCmdRequestParams executeCmdRequestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        int i;
        if (executeCmdRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(25, executeCmdRequestParams, iTsmCallback, iTsmProgressCallback);
            }
            ExecuteCmdRequestParams executeCmdRequestParams2 = new ExecuteCmdRequestParams();
            String reserve = executeCmdRequestParams.getReserve();
            String ssid = executeCmdRequestParams.getSsid();
            String sign = executeCmdRequestParams.getSign();
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                executeCmdRequestParams2.setReserve(b(reserve));
            }
            if (!TextUtils.isEmpty(ssid)) {
                executeCmdRequestParams2.setSsid(b(ssid));
            }
            if (!TextUtils.isEmpty(sign)) {
                executeCmdRequestParams2.setSign(b(sign));
            }
            this.H.put(String.valueOf(this.Z[25]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i2 = iArr[25];
                iArr[25] = i2 + 1;
                int executeCmd = iTsmService.executeCmd(executeCmdRequestParams2, new b(this, 25, i2, (byte) 0), iTsmProgressCallback);
                if (executeCmd != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.H;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[25] - 1;
                    iArr2[25] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == executeCmd) {
                    return a(25, executeCmdRequestParams, iTsmCallback, iTsmProgressCallback);
                }
                return executeCmd;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int getAccountBalance(GetAccountBalanceRequestParams getAccountBalanceRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getAccountBalanceRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(8, getAccountBalanceRequestParams, iTsmCallback);
            }
            GetAccountBalanceRequestParams getAccountBalanceRequestParams2 = new GetAccountBalanceRequestParams();
            String reserve = getAccountBalanceRequestParams.getReserve();
            AppID appID = getAccountBalanceRequestParams.getAppID();
            if (!TextUtils.isEmpty(reserve)) {
                getAccountBalanceRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    getAccountBalanceRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            String encryptPin = getAccountBalanceRequestParams.getEncryptPin();
            if (!TextUtils.isEmpty(encryptPin)) {
                getAccountBalanceRequestParams2.setEncryptPin(encryptPin);
            }
            try {
                int accountBalance = this.e.getAccountBalance(getAccountBalanceRequestParams2, new b(this, 8, this.Z[8], (byte) 0));
                if (-2 == accountBalance) {
                    return a(8, getAccountBalanceRequestParams, iTsmCallback);
                }
                if (accountBalance == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.v;
                    int[] iArr = this.Z;
                    int i2 = iArr[8];
                    iArr[8] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return accountBalance;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int getAccountInfo(GetAccountInfoRequestParams getAccountInfoRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getAccountInfoRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(7, getAccountInfoRequestParams, iTsmCallback);
            }
            GetAccountInfoRequestParams getAccountInfoRequestParams2 = new GetAccountInfoRequestParams();
            String reserve = getAccountInfoRequestParams.getReserve();
            AppID appID = getAccountInfoRequestParams.getAppID();
            if (!TextUtils.isEmpty(reserve)) {
                getAccountInfoRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    getAccountInfoRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            try {
                int accountInfo = this.e.getAccountInfo(getAccountInfoRequestParams2, new b(this, 7, this.Z[7], (byte) 0));
                if (-2 == accountInfo) {
                    return a(7, getAccountInfoRequestParams, iTsmCallback);
                }
                if (accountInfo == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.u;
                    int[] iArr = this.Z;
                    int i2 = iArr[7];
                    iArr[7] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return accountInfo;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int getAppDetail(GetAppDetailRequestParams getAppDetailRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getAppDetailRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(4, getAppDetailRequestParams, iTsmCallback);
            }
            GetAppDetailRequestParams getAppDetailRequestParams2 = new GetAppDetailRequestParams();
            String reserve = getAppDetailRequestParams.getReserve();
            AppID appID = getAppDetailRequestParams.getAppID();
            String transType = getAppDetailRequestParams.getTransType();
            if (!TextUtils.isEmpty(reserve)) {
                getAppDetailRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    getAppDetailRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            if (!TextUtils.isEmpty(transType)) {
                getAppDetailRequestParams2.setTransType(b(transType));
            }
            try {
                int appDetail = this.e.getAppDetail(getAppDetailRequestParams2, new b(this, 4, this.Z[4], (byte) 0));
                if (-2 == appDetail) {
                    return a(4, getAppDetailRequestParams, iTsmCallback);
                }
                if (appDetail == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.n;
                    int[] iArr = this.Z;
                    int i2 = iArr[4];
                    iArr[4] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return appDetail;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int getAppList(GetAppListRequestParams getAppListRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getAppListRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(2, getAppListRequestParams, iTsmCallback);
            }
            GetAppListRequestParams getAppListRequestParams2 = new GetAppListRequestParams();
            String reserve = getAppListRequestParams.getReserve();
            String keyword = getAppListRequestParams.getKeyword();
            String[] status = getAppListRequestParams.getStatus();
            if (!TextUtils.isEmpty(reserve)) {
                getAppListRequestParams2.setReserve(b(reserve));
            }
            if (!TextUtils.isEmpty(keyword)) {
                getAppListRequestParams2.setKeyword(b(keyword));
            }
            if (status != null) {
                int length = status.length;
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    if (!TextUtils.isEmpty(status[i2])) {
                        strArr[i2] = b(status[i2]);
                    }
                }
                getAppListRequestParams2.setStatus(strArr);
            }
            try {
                int appList = this.e.getAppList(getAppListRequestParams2, new b(this, 2, this.Z[2], (byte) 0));
                if (-2 == appList) {
                    return a(2, getAppListRequestParams, iTsmCallback);
                }
                if (appList == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.l;
                    int[] iArr = this.Z;
                    int i3 = iArr[2];
                    iArr[2] = i3 + 1;
                    hashMap.put(String.valueOf(i3), iTsmCallback);
                }
                return appList;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int getAppStatus(GetAppStatusRequestParams getAppStatusRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getAppStatusRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(5, getAppStatusRequestParams, iTsmCallback);
            }
            GetAppStatusRequestParams getAppStatusRequestParams2 = new GetAppStatusRequestParams();
            String reserve = getAppStatusRequestParams.getReserve();
            AppID appID = getAppStatusRequestParams.getAppID();
            if (!TextUtils.isEmpty(reserve)) {
                getAppStatusRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    getAppStatusRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            try {
                int appStatus = this.e.getAppStatus(getAppStatusRequestParams2, new b(this, 5, this.Z[5], (byte) 0));
                if (-2 == appStatus) {
                    return a(5, getAppStatusRequestParams, iTsmCallback);
                }
                if (appStatus == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.m;
                    int[] iArr = this.Z;
                    int i2 = iArr[5];
                    iArr[5] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return appStatus;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int getAssociatedApp(GetAssociatedAppRequestParams getAssociatedAppRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getAssociatedAppRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        String encryptPan = getAssociatedAppRequestParams.getEncryptPan();
        if (TextUtils.isEmpty(encryptPan)) {
            return -3;
        }
        if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(1, getAssociatedAppRequestParams, iTsmCallback);
            }
            GetAssociatedAppRequestParams getAssociatedAppRequestParams2 = new GetAssociatedAppRequestParams();
            String reserve = getAssociatedAppRequestParams.getReserve();
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                getAssociatedAppRequestParams2.setReserve(b(reserve));
            }
            getAssociatedAppRequestParams2.setEncryptPan(b(encryptPan));
            try {
                int associatedApp = this.e.getAssociatedApp(getAssociatedAppRequestParams2, new b(this, 1, this.Z[1], (byte) 0));
                if (-2 == associatedApp) {
                    return a(1, getAssociatedAppRequestParams, iTsmCallback);
                }
                if (associatedApp == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.j;
                    int[] iArr = this.Z;
                    int i2 = iArr[1];
                    iArr[1] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return associatedApp;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int getCardInfo(GetCardInfoRequestParams getCardInfoRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getCardInfoRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        String[] appAID = getCardInfoRequestParams.getAppAID();
        int length = appAID.length;
        if (appAID != null && length != 0) {
            int i2 = 0;
            while (i2 < length && appAID[i2] == null) {
                i2++;
            }
            if (i2 == length) {
                return -3;
            }
            if (!c()) {
                i = -8;
            } else if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(6, getCardInfoRequestParams, iTsmCallback);
                }
                String[] strArr = new String[length];
                for (int i3 = 0; i3 < length; i3++) {
                    if (appAID[i3] == null) {
                        strArr[i3] = appAID[i3];
                    } else {
                        strArr[i3] = b(appAID[i3]);
                    }
                }
                GetCardInfoRequestParams getCardInfoRequestParams2 = new GetCardInfoRequestParams();
                getCardInfoRequestParams2.setAppAID(strArr);
                String reserve = getCardInfoRequestParams.getReserve();
                if (this.h) {
                    reserve = g(f(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    getCardInfoRequestParams2.setReserve(b(reserve));
                }
                try {
                    int cardInfo = this.e.getCardInfo(getCardInfoRequestParams2, new b(this, 6, this.Z[6], (byte) 0));
                    if (-2 == cardInfo) {
                        return a(6, getCardInfoRequestParams, iTsmCallback);
                    }
                    if (cardInfo == 0) {
                        HashMap<String, ITsmCallback> hashMap = this.A;
                        int[] iArr = this.Z;
                        int i4 = iArr[6];
                        iArr[6] = i4 + 1;
                        hashMap.put(String.valueOf(i4), iTsmCallback);
                    }
                    return cardInfo;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            } else {
                i = -1;
            }
            return i;
        }
        return -3;
    }

    public synchronized int getCardInfoBySamsungPay(GetCardInfoBySpayRequestParams getCardInfoBySpayRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getCardInfoBySpayRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(28, getCardInfoBySpayRequestParams, iTsmCallback);
            }
            GetCardInfoBySpayRequestParams getCardInfoBySpayRequestParams2 = new GetCardInfoBySpayRequestParams();
            String reserve = getCardInfoBySpayRequestParams.getReserve();
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                getCardInfoBySpayRequestParams2.setReserve(b(reserve));
            }
            Amount amount = getCardInfoBySpayRequestParams.getAmount();
            if (amount != null) {
                String currencyType = amount.getCurrencyType();
                String productPrice = amount.getProductPrice();
                Amount amount2 = new Amount();
                if (!TextUtils.isEmpty(currencyType)) {
                    amount2.setCurrencyType(b(currencyType));
                }
                if (!TextUtils.isEmpty(productPrice)) {
                    amount2.setProductPrice(b(productPrice));
                }
                getCardInfoBySpayRequestParams2.setAmount(amount2);
            }
            this.I.put(String.valueOf(this.Z[28]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i2 = iArr[28];
                iArr[28] = i2 + 1;
                int cardInfoBySamsungPay = iTsmService.getCardInfoBySamsungPay(getCardInfoBySpayRequestParams2, new b(this, 28, i2, (byte) 0));
                if (cardInfoBySamsungPay != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.I;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[28] - 1;
                    iArr2[28] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == cardInfoBySamsungPay) {
                    return a(28, getCardInfoBySpayRequestParams, iTsmCallback);
                }
                return cardInfoBySamsungPay;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public Context getContext() {
        return this.c;
    }

    public int getCryptType() {
        return this.g;
    }

    @Deprecated
    public synchronized int getDefaultCard(GetDefaultCardRequestParams getDefaultCardRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(13, getDefaultCardRequestParams, iTsmCallback);
            }
            GetDefaultCardRequestParams getDefaultCardRequestParams2 = new GetDefaultCardRequestParams();
            if (getDefaultCardRequestParams != null) {
                String reserve = getDefaultCardRequestParams.getReserve();
                if (!TextUtils.isEmpty(reserve)) {
                    getDefaultCardRequestParams2.setReserve(b(reserve));
                }
            }
            try {
                int defaultCard = this.e.getDefaultCard(getDefaultCardRequestParams2, new b(this, 13, this.Z[13], (byte) 0));
                if (-2 == defaultCard) {
                    return a(13, getDefaultCardRequestParams, iTsmCallback);
                }
                if (defaultCard == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.y;
                    int[] iArr = this.Z;
                    int i2 = iArr[13];
                    iArr[13] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return defaultCard;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int getEncryptData(GetEncryptDataRequestParams getEncryptDataRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null || getEncryptDataRequestParams == null) {
            return -3;
        }
        int type = getEncryptDataRequestParams.getType();
        String pan = getEncryptDataRequestParams.getPan();
        if (type >= 2000 && type <= 2001) {
            if (type == 2000 && TextUtils.isEmpty(pan)) {
                return -3;
            }
            if (!c()) {
                i = -8;
            } else if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(31, getEncryptDataRequestParams, iTsmCallback);
                }
                GetEncryptDataRequestParams getEncryptDataRequestParams2 = new GetEncryptDataRequestParams();
                if (type == 2000) {
                    getEncryptDataRequestParams2.setPan(b(pan));
                }
                getEncryptDataRequestParams2.setType(type);
                String reserve = getEncryptDataRequestParams.getReserve();
                if (this.h) {
                    reserve = g(f(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    getEncryptDataRequestParams2.setReserve(b(reserve));
                }
                this.L.put(String.valueOf(this.Z[31]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[31];
                    iArr[31] = i2 + 1;
                    int encryptData = iTsmService.getEncryptData(getEncryptDataRequestParams2, new b(this, 31, i2, (byte) 0));
                    if (encryptData != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.L;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[31] - 1;
                        iArr2[31] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == encryptData) {
                        return a(31, getEncryptDataRequestParams, iTsmCallback);
                    }
                    return encryptData;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            } else {
                i = -1;
            }
            return i;
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
        } else if (!d("01.00.35")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(44, getMessageDetailsRequestParams, iTsmCallback);
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
                if (this.h) {
                    str = g(f(str));
                }
                if (!TextUtils.isEmpty(str)) {
                    getMessageDetailsRequestParams2.setReserve(b(str));
                }
                this.V.put(String.valueOf(this.Z[44]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[44];
                    iArr[44] = i2 + 1;
                    int messageDetails = iTsmService.getMessageDetails(getMessageDetailsRequestParams2, new b(this, 44, i2, (byte) 0));
                    if (messageDetails != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.V;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[44] - 1;
                        iArr2[44] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == messageDetails) {
                        return a(44, getMessageDetailsRequestParams, iTsmCallback);
                    }
                    return messageDetails;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    public int getPubKey(int i, String[] strArr) throws RemoteException {
        if (strArr == null || strArr.length == 0) {
            return -3;
        }
        if (c()) {
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
        return -8;
    }

    @Deprecated
    public synchronized int getSEAppList(GetSeAppListRequestParams getSeAppListRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(3, getSeAppListRequestParams, iTsmCallback);
            }
            GetSeAppListRequestParams getSeAppListRequestParams2 = new GetSeAppListRequestParams();
            String reserve = getSeAppListRequestParams != null ? getSeAppListRequestParams.getReserve() : "";
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                getSeAppListRequestParams2.setReserve(b(reserve));
            }
            this.k.put(String.valueOf(this.Z[3]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i2 = iArr[3];
                iArr[3] = i2 + 1;
                int sEAppList = iTsmService.getSEAppList(getSeAppListRequestParams2, new b(this, 3, i2, (byte) 0));
                if (sEAppList != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.k;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[3] - 1;
                    iArr2[3] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == sEAppList) {
                    return a(3, getSeAppListRequestParams, iTsmCallback);
                }
                return sEAppList;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int getSMSAuthCode(GetSMSAuthCodeRequestParams getSMSAuthCodeRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getSMSAuthCodeRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(11, getSMSAuthCodeRequestParams, iTsmCallback);
            }
            GetSMSAuthCodeRequestParams getSMSAuthCodeRequestParams2 = new GetSMSAuthCodeRequestParams();
            String reserve = getSMSAuthCodeRequestParams.getReserve();
            AppID appID = getSMSAuthCodeRequestParams.getAppID();
            if (!TextUtils.isEmpty(reserve)) {
                getSMSAuthCodeRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    getSMSAuthCodeRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            String pan = getSMSAuthCodeRequestParams.getPan();
            String msisdn = getSMSAuthCodeRequestParams.getMsisdn();
            if (!TextUtils.isEmpty(pan)) {
                getSMSAuthCodeRequestParams2.setPan(b(pan));
            }
            if (!TextUtils.isEmpty(msisdn)) {
                getSMSAuthCodeRequestParams2.setMsisdn(b(msisdn));
            }
            try {
                int sMSAuthCode = this.e.getSMSAuthCode(getSMSAuthCodeRequestParams2, new b(this, 11, this.Z[11], (byte) 0));
                if (-2 == sMSAuthCode) {
                    return a(11, getSMSAuthCodeRequestParams, iTsmCallback);
                }
                if (sMSAuthCode == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.r;
                    int[] iArr = this.Z;
                    int i2 = iArr[11];
                    iArr[11] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return sMSAuthCode;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int getSeId(GetSeIdRequestParams getSeIdRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(12, getSeIdRequestParams, iTsmCallback);
            }
            GetSeIdRequestParams getSeIdRequestParams2 = new GetSeIdRequestParams();
            String reserve = getSeIdRequestParams != null ? getSeIdRequestParams.getReserve() : "";
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                getSeIdRequestParams2.setReserve(b(reserve));
            }
            this.z.put(String.valueOf(this.Z[12]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i2 = iArr[12];
                iArr[12] = i2 + 1;
                int sEId = iTsmService.getSEId(getSeIdRequestParams2, new b(this, 12, i2, (byte) 0));
                if (sEId != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.z;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[12] - 1;
                    iArr2[12] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == sEId) {
                    return a(12, getSeIdRequestParams, iTsmCallback);
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

    @Deprecated
    public synchronized int getTransElements(GetTransElementsRequestParams getTransElementsRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getTransElementsRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(9, getTransElementsRequestParams, iTsmCallback);
            }
            GetTransElementsRequestParams getTransElementsRequestParams2 = new GetTransElementsRequestParams();
            String reserve = getTransElementsRequestParams.getReserve();
            AppID appID = getTransElementsRequestParams.getAppID();
            String transType = getTransElementsRequestParams.getTransType();
            if (!TextUtils.isEmpty(reserve)) {
                getTransElementsRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    getTransElementsRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            if (!TextUtils.isEmpty(transType)) {
                getTransElementsRequestParams2.setTransType(b(transType));
            }
            try {
                int transElements = this.e.getTransElements(getTransElementsRequestParams2, new b(this, 9, this.Z[9], (byte) 0));
                if (-2 == transElements) {
                    return a(9, getTransElementsRequestParams, iTsmCallback);
                }
                if (transElements == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.o;
                    int[] iArr = this.Z;
                    int i2 = iArr[9];
                    iArr[9] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return transElements;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int getTransRecord(GetTransRecordRequestParams getTransRecordRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (getTransRecordRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(10, getTransRecordRequestParams, iTsmCallback);
            }
            GetTransRecordRequestParams getTransRecordRequestParams2 = new GetTransRecordRequestParams();
            String reserve = getTransRecordRequestParams.getReserve();
            AppID appID = getTransRecordRequestParams.getAppID();
            if (!TextUtils.isEmpty(reserve)) {
                getTransRecordRequestParams2.setReserve(b(reserve));
            }
            if (appID != null) {
                String appAid = appID.getAppAid();
                String appVersion = appID.getAppVersion();
                if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                    getTransRecordRequestParams2.setAppID(new AppID(b(appAid), b(appVersion)));
                }
            }
            try {
                int transRecord = this.e.getTransRecord(getTransRecordRequestParams2, new b(this, 10, this.Z[10], (byte) 0));
                if (-2 == transRecord) {
                    return a(10, getTransRecordRequestParams, iTsmCallback);
                }
                if (transRecord == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.t;
                    int[] iArr = this.Z;
                    int i2 = iArr[10];
                    iArr[10] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return transRecord;
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
        } else if (!d("01.00.35")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(43, getTransactionDetailsRequestParams, iTsmCallback);
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
                if (this.h) {
                    str = g(f(str));
                }
                if (!TextUtils.isEmpty(str)) {
                    getTransactionDetailsRequestParams2.setReserve(b(str));
                }
                this.U.put(String.valueOf(this.Z[43]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[43];
                    iArr[43] = i2 + 1;
                    int transactionDetails = iTsmService.getTransactionDetails(getTransactionDetailsRequestParams2, new b(this, 43, i2, (byte) 0));
                    if (transactionDetails != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.U;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[43] - 1;
                        iArr2[43] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == transactionDetails) {
                        return a(43, getTransactionDetailsRequestParams, iTsmCallback);
                    }
                    return transactionDetails;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    public synchronized int getVendorPayStatus(GetVendorPayStatusRequestParams getVendorPayStatusRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!d("01.00.20")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(36, getVendorPayStatusRequestParams, iTsmCallback);
                }
                GetVendorPayStatusRequestParams getVendorPayStatusRequestParams2 = new GetVendorPayStatusRequestParams();
                String reserve = getVendorPayStatusRequestParams != null ? getVendorPayStatusRequestParams.getReserve() : "";
                if (this.h) {
                    reserve = g(f(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    getVendorPayStatusRequestParams2.setReserve(b(reserve));
                }
                this.N.put(String.valueOf(this.Z[36]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[36];
                    iArr[36] = i2 + 1;
                    int vendorPayStatus = iTsmService.getVendorPayStatus(getVendorPayStatusRequestParams2, new b(this, 36, i2, (byte) 0));
                    if (vendorPayStatus != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.N;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[36] - 1;
                        iArr2[36] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == vendorPayStatus) {
                        return a(36, getVendorPayStatusRequestParams, iTsmCallback);
                    }
                    return vendorPayStatus;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    public synchronized int hideAppApply(HideAppApplyRequestParams hideAppApplyRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (hideAppApplyRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        String applyId = hideAppApplyRequestParams.getApplyId();
        if (TextUtils.isEmpty(applyId)) {
            return -3;
        }
        if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(24, hideAppApplyRequestParams, iTsmCallback);
            }
            String b2 = b(applyId);
            HideAppApplyRequestParams hideAppApplyRequestParams2 = new HideAppApplyRequestParams();
            hideAppApplyRequestParams2.setApplyId(b2);
            String reserve = hideAppApplyRequestParams.getReserve();
            if (!TextUtils.isEmpty(reserve)) {
                hideAppApplyRequestParams2.setReserve(b(reserve));
            }
            try {
                int hideAppApply = this.e.hideAppApply(hideAppApplyRequestParams2, new b(this, 24, this.Z[24], (byte) 0));
                if (-2 == hideAppApply) {
                    return a(24, hideAppApplyRequestParams, iTsmCallback);
                }
                if (hideAppApply == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.G;
                    int[] iArr = this.Z;
                    int i2 = iArr[24];
                    iArr[24] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return hideAppApply;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060 A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x000e, B:12:0x001e, B:14:0x0026, B:16:0x0031, B:17:0x0039, B:19:0x003f, B:20:0x0046, B:23:0x004e, B:24:0x0056, B:28:0x0060, B:25:0x0057, B:34:0x0069, B:35:0x0071, B:36:0x0072), top: B:47:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int hideKeyboard() throws android.os.RemoteException {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.c()     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto La
            r0 = -8
        L8:
            monitor-exit(r6)
            return r0
        La:
            com.unionpay.tsmservice.ITsmService r0 = r6.e     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L78
            android.content.Context r0 = r6.c     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L7a
            boolean r0 = a(r0)     // Catch: java.lang.Throwable -> L7a
            r1 = 0
            r2 = 34
            r3 = 0
            if (r0 == 0) goto L72
            java.lang.String r0 = "01.00.24"
            boolean r0 = r6.d(r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L57
            com.unionpay.tsmservice.request.HideSafetyKeyboardRequestParams r0 = new com.unionpay.tsmservice.request.HideSafetyKeyboardRequestParams     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = ""
            boolean r5 = r6.h     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L39
            java.lang.String r4 = f(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r6.g(r4)     // Catch: java.lang.Throwable -> L7a
        L39:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L7a
            if (r5 != 0) goto L46
            java.lang.String r4 = r6.b(r4)     // Catch: java.lang.Throwable -> L7a
            r0.setReserve(r4)     // Catch: java.lang.Throwable -> L7a
        L46:
            com.unionpay.tsmservice.ITsmService r4 = r6.e     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L7a
            int r0 = r4.hideSafetyKeyboard(r0)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L7a
            goto L5d
        L4d:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L7a
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L7a
        L57:
            com.unionpay.tsmservice.ITsmService r0 = r6.e     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L7a
            int r0 = r0.hideKeyboard()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L7a
        L5d:
            r4 = -2
            if (r4 != r0) goto L66
            int r0 = a(r2, r3, r1, r3, r3)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r6)
            return r0
        L66:
            monitor-exit(r6)
            return r0
        L68:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L7a
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L7a
        L72:
            int r0 = a(r2, r3, r1, r3, r3)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r6)
            return r0
        L78:
            r0 = -1
            goto L8
        L7a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.tsmservice.UPTsmAddon.hideKeyboard():int");
    }

    public synchronized int init(InitRequestParams initRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(0, initRequestParams, iTsmCallback);
            }
            InitRequestParams initRequestParams2 = new InitRequestParams();
            String str = "";
            if (initRequestParams != null) {
                str = initRequestParams.getReserve();
                String signature = initRequestParams.getSignature();
                if (!TextUtils.isEmpty(signature)) {
                    initRequestParams2.setSignature(b(signature));
                }
            }
            if (this.h) {
                str = g(f(str));
            }
            if (!TextUtils.isEmpty(str)) {
                initRequestParams2.setReserve(b(str));
            }
            this.i.put(String.valueOf(this.Z[0]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i2 = iArr[0];
                iArr[0] = i2 + 1;
                int init = iTsmService.init(initRequestParams2, new b(this, 0, i2, (byte) 0));
                if (init != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.i;
                    int[] iArr2 = this.Z;
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
        } else if (!d("01.00.21")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(39, onlinePaymentVerifyRequestParams, iTsmCallback);
                }
                OnlinePaymentVerifyRequestParams onlinePaymentVerifyRequestParams2 = new OnlinePaymentVerifyRequestParams();
                Bundle resource = onlinePaymentVerifyRequestParams.getResource();
                if (resource != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("encryptData", a(resource));
                    onlinePaymentVerifyRequestParams2.setResource(bundle);
                }
                String orderNumber = onlinePaymentVerifyRequestParams.getOrderNumber();
                String aId = onlinePaymentVerifyRequestParams.getAId();
                if (!TextUtils.isEmpty(orderNumber)) {
                    onlinePaymentVerifyRequestParams2.setOrderNumber(b(orderNumber));
                }
                if (!TextUtils.isEmpty(aId)) {
                    onlinePaymentVerifyRequestParams2.setAId(b(aId));
                }
                String reserve = onlinePaymentVerifyRequestParams.getReserve();
                if (this.h) {
                    reserve = g(f(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    onlinePaymentVerifyRequestParams2.setReserve(b(reserve));
                }
                this.Q.put(String.valueOf(this.Z[39]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[39];
                    iArr[39] = i2 + 1;
                    int onlinePaymentVerify = iTsmService.onlinePaymentVerify(onlinePaymentVerifyRequestParams2, new b(this, 39, i2, (byte) 0));
                    if (onlinePaymentVerify != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.Q;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[39] - 1;
                        iArr2[39] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == onlinePaymentVerify) {
                        return a(39, onlinePaymentVerifyRequestParams, iTsmCallback);
                    }
                    return onlinePaymentVerify;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    public synchronized int openChannel(OpenChannelRequestParams openChannelRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (openChannelRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        String appAID = openChannelRequestParams.getAppAID();
        if (TextUtils.isEmpty(appAID)) {
            return -3;
        }
        if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(20, openChannelRequestParams, iTsmCallback);
            }
            String b2 = b(appAID);
            OpenChannelRequestParams openChannelRequestParams2 = new OpenChannelRequestParams();
            openChannelRequestParams2.setAppAID(b2);
            String reserve = openChannelRequestParams.getReserve();
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                openChannelRequestParams2.setReserve(b(reserve));
            }
            this.w.put(String.valueOf(this.Z[20]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i2 = iArr[20];
                iArr[20] = i2 + 1;
                int openChannel = iTsmService.openChannel(openChannelRequestParams2, new b(this, 20, i2, (byte) 0));
                if (openChannel != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.w;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[20] - 1;
                    iArr2[20] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == openChannel) {
                    return a(20, openChannelRequestParams, iTsmCallback);
                }
                return openChannel;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int preDownload(PreDownloadRequestParams preDownloadRequestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!d("01.00.26")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(40, preDownloadRequestParams, iTsmCallback, iTsmProgressCallback);
                }
                PreDownloadRequestParams preDownloadRequestParams2 = new PreDownloadRequestParams();
                String str = "";
                if (preDownloadRequestParams != null) {
                    str = preDownloadRequestParams.getReserve();
                    Bundle params = preDownloadRequestParams.getParams();
                    if (params != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("encryptData", a(params));
                        preDownloadRequestParams2.setParams(bundle);
                    }
                }
                if (this.h) {
                    str = g(f(str));
                }
                if (!TextUtils.isEmpty(str)) {
                    preDownloadRequestParams2.setReserve(b(str));
                }
                this.R.put(String.valueOf(this.Z[40]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[40];
                    iArr[40] = i2 + 1;
                    int preDownload = iTsmService.preDownload(preDownloadRequestParams2, new b(this, 40, i2, (byte) 0), iTsmProgressCallback);
                    if (preDownload != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.R;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[40] - 1;
                        iArr2[40] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == preDownload) {
                        return a(40, preDownloadRequestParams, iTsmCallback, iTsmProgressCallback);
                    }
                    return preDownload;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    public synchronized int queryVendorPayStatus(QueryVendorPayStatusRequestParams queryVendorPayStatusRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!d("01.00.27")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(41, queryVendorPayStatusRequestParams, iTsmCallback);
                }
                QueryVendorPayStatusRequestParams queryVendorPayStatusRequestParams2 = new QueryVendorPayStatusRequestParams();
                String reserve = queryVendorPayStatusRequestParams != null ? queryVendorPayStatusRequestParams.getReserve() : "";
                if (this.h) {
                    reserve = g(f(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    queryVendorPayStatusRequestParams2.setReserve(b(reserve));
                }
                this.S.put(String.valueOf(this.Z[41]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[41];
                    iArr[41] = i2 + 1;
                    int queryVendorPayStatus = iTsmService.queryVendorPayStatus(queryVendorPayStatusRequestParams2, new b(this, 41, i2, (byte) 0));
                    if (queryVendorPayStatus != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.S;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[41] - 1;
                        iArr2[41] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == queryVendorPayStatus) {
                        return a(41, queryVendorPayStatusRequestParams, iTsmCallback);
                    }
                    return queryVendorPayStatus;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    public synchronized void removeConnectionListener(UPTsmConnectionListener uPTsmConnectionListener) {
        if (uPTsmConnectionListener != null) {
            b.remove(uPTsmConnectionListener);
        }
    }

    public synchronized int sendApdu(SendApduRequestParams sendApduRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (sendApduRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(22, sendApduRequestParams, iTsmCallback);
            }
            SendApduRequestParams sendApduRequestParams2 = new SendApduRequestParams();
            String reserve = sendApduRequestParams.getReserve();
            String channel = sendApduRequestParams.getChannel();
            String hexApdu = sendApduRequestParams.getHexApdu();
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                sendApduRequestParams2.setReserve(b(reserve));
            }
            if (!TextUtils.isEmpty(channel)) {
                sendApduRequestParams2.setChannel(b(channel));
            }
            if (!TextUtils.isEmpty(hexApdu)) {
                sendApduRequestParams2.setHexApdu(b(hexApdu));
            }
            this.x.put(String.valueOf(this.Z[22]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i2 = iArr[22];
                iArr[22] = i2 + 1;
                int sendApdu = iTsmService.sendApdu(sendApduRequestParams2, new b(this, 22, i2, (byte) 0));
                if (sendApdu != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.x;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[22] - 1;
                    iArr2[22] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == sendApdu) {
                    return a(22, sendApduRequestParams, iTsmCallback);
                }
                return sendApdu;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int sendCustomData(SendCustomDataRequestParams sendCustomDataRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (sendCustomDataRequestParams == null || iTsmCallback == null) {
            i = -3;
        } else if (!d("01.00.37")) {
            return -8;
        } else {
            if (!c()) {
                return -8;
            }
            if (this.e != null) {
                if (!a(this.c.getPackageName())) {
                    return a(45, sendCustomDataRequestParams, iTsmCallback);
                }
                SendCustomDataRequestParams sendCustomDataRequestParams2 = new SendCustomDataRequestParams();
                Bundle params = sendCustomDataRequestParams.getParams();
                if (params != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("encryptData", a(params));
                    sendCustomDataRequestParams2.setParams(bundle);
                }
                String reserve = sendCustomDataRequestParams.getReserve();
                if (this.h) {
                    reserve = g(f(reserve));
                }
                if (!TextUtils.isEmpty(reserve)) {
                    sendCustomDataRequestParams2.setReserve(b(reserve));
                }
                this.W.put(String.valueOf(this.Z[45]), iTsmCallback);
                try {
                    ITsmService iTsmService = this.e;
                    int[] iArr = this.Z;
                    int i2 = iArr[45];
                    iArr[45] = i2 + 1;
                    int sendCustomData = iTsmService.sendCustomData(sendCustomDataRequestParams2, new b(this, 45, i2, (byte) 0));
                    if (sendCustomData != 0) {
                        HashMap<String, ITsmCallback> hashMap = this.W;
                        int[] iArr2 = this.Z;
                        int i3 = iArr2[45] - 1;
                        iArr2[45] = i3;
                        hashMap.remove(String.valueOf(i3));
                    }
                    if (-2 == sendCustomData) {
                        return a(45, sendCustomDataRequestParams, iTsmCallback);
                    }
                    return sendCustomData;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RemoteException();
                }
            }
            i = -1;
        }
        return i;
    }

    @Deprecated
    public synchronized int setDefaultCard(SetDefaultCardRequestParams setDefaultCardRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (setDefaultCardRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        String appAID = setDefaultCardRequestParams.getAppAID();
        if (TextUtils.isEmpty(appAID)) {
            return -3;
        }
        if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(14, setDefaultCardRequestParams, iTsmCallback);
            }
            String b2 = b(appAID);
            SetDefaultCardRequestParams setDefaultCardRequestParams2 = new SetDefaultCardRequestParams();
            setDefaultCardRequestParams2.setAppAID(b2);
            String reserve = setDefaultCardRequestParams.getReserve();
            if (!TextUtils.isEmpty(reserve)) {
                setDefaultCardRequestParams2.setReserve(b(reserve));
            }
            try {
                int defaultCard = this.e.setDefaultCard(setDefaultCardRequestParams2, new b(this, 14, this.Z[14], (byte) 0));
                if (-2 == defaultCard) {
                    return a(14, setDefaultCardRequestParams, iTsmCallback);
                }
                if (defaultCard == 0) {
                    HashMap<String, ITsmCallback> hashMap = this.E;
                    int[] iArr = this.Z;
                    int i2 = iArr[14];
                    iArr[14] = i2 + 1;
                    hashMap.put(String.valueOf(i2), iTsmCallback);
                }
                return defaultCard;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        } else {
            i = -1;
        }
        return i;
    }

    public synchronized int setSafetyKeyboardBitmap(SafetyKeyboardRequestParams safetyKeyboardRequestParams) throws RemoteException {
        int i;
        if (safetyKeyboardRequestParams == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(32, safetyKeyboardRequestParams, null);
            }
            String reserve = safetyKeyboardRequestParams.getReserve();
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                safetyKeyboardRequestParams.setReserve(b(reserve));
            }
            try {
                int safetyKeyboardBitmap = this.e.setSafetyKeyboardBitmap(safetyKeyboardRequestParams);
                if (-2 == safetyKeyboardBitmap) {
                    return a(32, safetyKeyboardRequestParams, null);
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

    public synchronized int setSamsungDefaultWallet(SetSamsungDefWalletRequestParams setSamsungDefWalletRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int i;
        if (iTsmCallback == null) {
            i = -3;
        } else if (!c()) {
            i = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(30, setSamsungDefWalletRequestParams, iTsmCallback);
            }
            SetSamsungDefWalletRequestParams setSamsungDefWalletRequestParams2 = new SetSamsungDefWalletRequestParams();
            if (setSamsungDefWalletRequestParams != null) {
                String reserve = setSamsungDefWalletRequestParams.getReserve();
                if (!TextUtils.isEmpty(reserve)) {
                    setSamsungDefWalletRequestParams2.setReserve(b(reserve));
                }
            }
            this.K.put(String.valueOf(this.Z[30]), iTsmCallback);
            try {
                ITsmService iTsmService = this.e;
                int[] iArr = this.Z;
                int i2 = iArr[30];
                iArr[30] = i2 + 1;
                int samsungDefaultWallet = iTsmService.setSamsungDefaultWallet(setSamsungDefWalletRequestParams2, new b(this, 30, i2, (byte) 0));
                if (samsungDefaultWallet != 0) {
                    HashMap<String, ITsmCallback> hashMap = this.K;
                    int[] iArr2 = this.Z;
                    int i3 = iArr2[30] - 1;
                    iArr2[30] = i3;
                    hashMap.remove(String.valueOf(i3));
                }
                if (-2 == samsungDefaultWallet) {
                    return a(30, setSamsungDefWalletRequestParams, iTsmCallback);
                }
                return samsungDefaultWallet;
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
        if (safetyKeyboardRequestParams == null || i < 2000 || i > 2001) {
            i2 = -3;
        } else if (!c()) {
            i2 = -8;
        } else if (this.e != null) {
            if (!a(this.c.getPackageName())) {
                return a(1000, safetyKeyboardRequestParams, i, onSafetyKeyboardCallback, context);
            }
            this.Y.put(this.c.getPackageName(), new com.unionpay.tsmservice.a(context));
            String reserve = safetyKeyboardRequestParams.getReserve();
            if (this.h) {
                reserve = g(f(reserve));
            }
            if (!TextUtils.isEmpty(reserve)) {
                safetyKeyboardRequestParams.setReserve(b(reserve));
            }
            try {
                int showSafetyKeyboard = this.e.showSafetyKeyboard(safetyKeyboardRequestParams, i, onSafetyKeyboardCallback, new a());
                if (showSafetyKeyboard != 0) {
                    this.Y.remove(this.c.getPackageName());
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
