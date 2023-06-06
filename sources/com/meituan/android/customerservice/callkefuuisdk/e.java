package com.meituan.android.customerservice.callkefuuisdk;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.callkefuuisdk.bean.CSVoIPInfoBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mapsdk.internal.y;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile e k;
    public String b;
    public String c;
    public boolean d;
    public Application e;
    public TypedArray f;
    public HashMap<String, String> g;
    public HashMap<String, String> h;
    private b i;
    private String j;
    private com.meituan.android.customerservice.callkefuuisdk.a l;
    private BroadcastReceiver m;

    public static /* synthetic */ String b(e eVar) {
        return "imeituan://www.meituan.com/voip/callkf";
    }

    public static /* synthetic */ HashMap a(e eVar, HashMap hashMap, short s) {
        Object[] objArr = {hashMap, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "e56dffe1634f353e3d9c523a86193e11", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "e56dffe1634f353e3d9c523a86193e11");
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        if (TextUtils.isEmpty((CharSequence) hashMap.get("tenantId")) && s == 3) {
            hashMap.put("tenantId", "8fe8e0d8-d02c-11e8-94b3-002296936f17");
        }
        return hashMap;
    }

    public static /* synthetic */ HashMap a(e eVar, short s, String str, String str2, String str3, String str4) {
        Object[] objArr = {Short.valueOf(s), str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "e7088af91d6332f9c5c2b27aedb64cfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "e7088af91d6332f9c5c2b27aedb64cfe");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("call_number", str2);
        hashMap.put("call_avatar_url", str3);
        hashMap.put("call_name", str4);
        hashMap.put("call_type", String.valueOf((int) s));
        hashMap.put("call_init_token", eVar.i.a());
        hashMap.put("call_init_appName", eVar.i.h());
        hashMap.put("call_channel", str);
        hashMap.put("call_init_appid", String.valueOf((int) eVar.i.b()));
        hashMap.put("call_init_devicetype", String.valueOf((int) eVar.i.d()));
        hashMap.put("call_init_uid", String.valueOf(eVar.i.e()));
        hashMap.put("call_init_user_name", eVar.i.f());
        hashMap.put("call_init_appkey", eVar.j);
        hashMap.put("call_init_env", eVar.i.g());
        Class<?> cls = eVar.getClass();
        CallLog.i(cls, "voip env: " + eVar.i.g());
        if (s == 3 && eVar.l != null) {
            hashMap.put("call_is_show_upload_btn", String.valueOf(eVar.l.a));
        }
        return hashMap;
    }

    private e(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f956fd3564be96f048450e5e604e2548", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f956fd3564be96f048450e5e604e2548");
            return;
        }
        this.h = new HashMap<>();
        this.m = new BroadcastReceiver() { // from class: com.meituan.android.customerservice.callkefuuisdk.VoIP$1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d017cfbe194f3beb8d2be134504a56ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d017cfbe194f3beb8d2be134504a56ab");
                } else if (intent == null || !TextUtils.equals("csc:csc_voip_status", intent.getAction())) {
                    CallLog.d("VoIP", "VoIP KNB BroadcastReceiver， intent is null or itent is error, return");
                } else {
                    String a2 = f.a(intent, "data");
                    CallLog.d("VoIP", "VoIP KNB BroadcastReceiver:" + a2);
                    if (TextUtils.isEmpty(a2)) {
                        CallLog.d("VoIP", "VoIP KNB BroadcastReceiver, data is null ,return");
                        return;
                    }
                    try {
                        Uri parse = Uri.parse(e.b(e.this));
                        CSVoIPInfoBean cSVoIPInfoBean = (CSVoIPInfoBean) new Gson().fromJson(a2, (Class<Object>) CSVoIPInfoBean.class);
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setPackage(context.getPackageName());
                        intent2.setData(parse);
                        intent2.putExtra("call_associated_data", e.a(e.this, cSVoIPInfoBean.getAssociatedData(), cSVoIPInfoBean.getMediaType()));
                        intent2.putExtra("call_init_data", e.a(e.this, cSVoIPInfoBean.getMediaType(), cSVoIPInfoBean.getChannel(), cSVoIPInfoBean.getPhoneNumber(), cSVoIPInfoBean.getAvatarURL(), cSVoIPInfoBean.getName()));
                        intent2.addFlags(y.a);
                        context.startActivity(intent2);
                        CallLog.d("VoIP", "start voip activity");
                    } catch (Exception e) {
                        CallLog.d("VoIP", "VoIP KNB exception:" + e.toString());
                    }
                }
            }
        };
        this.e = application;
    }

    public static e a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "365e10221b0bf65805ec49686b20f290", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "365e10221b0bf65805ec49686b20f290");
        }
        if (k == null) {
            synchronized (e.class) {
                if (k == null) {
                    k = new e(application);
                }
            }
        }
        return k;
    }

    public synchronized HashMap<String, String> a() {
        return this.h;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements com.meituan.android.customerservice.callbase.base.c {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.meituan.android.customerservice.callbase.base.c
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa2bac697c113bdec424312b1d702ae5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa2bac697c113bdec424312b1d702ae5") : (String) e.this.a().get("call_init_token");
        }

        @Override // com.meituan.android.customerservice.callbase.base.c
        public final short b() {
            short s = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b49475c19197c2fefc2204e3c2cf965f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b49475c19197c2fefc2204e3c2cf965f")).shortValue();
            }
            try {
                s = Short.valueOf((String) e.this.a().get("call_init_appid")).shortValue();
            } catch (Exception e) {
                CallLog.i("VoIP", "Get appId exception " + e.getMessage());
            }
            CallLog.i("VoIP", "appId: " + ((int) s));
            return s;
        }

        @Override // com.meituan.android.customerservice.callbase.base.c
        public final short c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7eb801279b3255ae6dcbe25df4b899", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7eb801279b3255ae6dcbe25df4b899")).shortValue();
            }
            if (e.this.a().get("call_channel") != null) {
                return Short.valueOf((String) e.this.a().get("call_channel")).shortValue();
            }
            return (short) 0;
        }

        @Override // com.meituan.android.customerservice.callbase.base.c
        public final byte d() {
            byte b = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a4ebbfcbc42063dba3bde64eef93474", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a4ebbfcbc42063dba3bde64eef93474")).byteValue();
            }
            try {
                b = Byte.valueOf((String) e.this.a().get("call_init_devicetype")).byteValue();
            } catch (Exception e) {
                CallLog.i("VoIP", "Get getDeviceType exception " + e.getMessage());
            }
            CallLog.i("VoIP", "deviceType: " + ((int) b));
            return b;
        }

        @Override // com.meituan.android.customerservice.callbase.base.c
        public final String e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d22aa6ea66640769e5363ac65e2b30b0", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d22aa6ea66640769e5363ac65e2b30b0");
            }
            CallLog.i("VoIP", "Uid: " + ((String) e.this.a().get("call_init_uid")));
            return (String) e.this.a().get("call_init_uid");
        }

        @Override // com.meituan.android.customerservice.callbase.base.c
        public final String f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c47e503f84424c91f5b07e472f106eb", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c47e503f84424c91f5b07e472f106eb");
            }
            CallLog.i("VoIP", "Uname: " + ((String) e.this.a().get("call_init_user_name")));
            return (String) e.this.a().get("call_init_user_name");
        }
    }
}
