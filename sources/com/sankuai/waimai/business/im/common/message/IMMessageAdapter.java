package com.sankuai.waimai.business.im.common.message;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMMessageAdapter implements IGeneralMsgAdapter {
    public static ChangeQuickRedirect a;
    private static Set<Integer> b = new HashSet();
    private Map<Integer, d> c;
    private com.sankuai.waimai.business.im.prepare.g d;
    private b e;
    private WMCommonDataInfo f;
    private com.sankuai.waimai.business.im.common.contract.a g;
    private String h;
    private String i;

    public Context a() {
        return null;
    }

    public IMMessageAdapter(com.sankuai.waimai.business.im.prepare.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff091715c91e8fe5b8f9d872e99df506", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff091715c91e8fe5b8f9d872e99df506");
            return;
        }
        this.c = new HashMap();
        this.e = new b();
        this.d = gVar;
    }

    public IMMessageAdapter(WMCommonDataInfo wMCommonDataInfo, com.sankuai.waimai.business.im.common.contract.a aVar, String str) {
        Object[] objArr = {wMCommonDataInfo, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef62b983d9fcbd52629fe440130b293", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef62b983d9fcbd52629fe440130b293");
            return;
        }
        this.c = new HashMap();
        this.e = new b();
        this.f = wMCommonDataInfo;
        this.g = aVar;
        this.h = str;
    }

    public IMMessageAdapter(WMCommonDataInfo wMCommonDataInfo, com.sankuai.waimai.business.im.common.contract.a aVar, String str, com.sankuai.waimai.business.im.prepare.g gVar) {
        Object[] objArr = {wMCommonDataInfo, aVar, str, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f55f75faec35dad512ecfdb6035f34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f55f75faec35dad512ecfdb6035f34");
            return;
        }
        this.c = new HashMap();
        this.e = new b();
        this.f = wMCommonDataInfo;
        this.g = aVar;
        this.h = str;
        this.d = gVar;
    }

    public IMMessageAdapter(WMCommonDataInfo wMCommonDataInfo, com.sankuai.waimai.business.im.common.contract.a aVar, String str, com.sankuai.waimai.business.im.prepare.g gVar, String str2) {
        Object[] objArr = {wMCommonDataInfo, aVar, str, gVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8687f4f3e38256e4174dec61122279ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8687f4f3e38256e4174dec61122279ab");
            return;
        }
        this.c = new HashMap();
        this.e = new b();
        this.f = wMCommonDataInfo;
        this.g = aVar;
        this.h = str;
        this.d = gVar;
        this.i = str2;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter
    public Set<Integer> getViewTypes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d8d2cafc05b2559359c95be3454d9b7", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d8d2cafc05b2559359c95be3454d9b7") : this.c.keySet();
    }

    public static int a(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2be12b841e5cdeb1739f20617be6ed51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2be12b841e5cdeb1739f20617be6ed51")).intValue();
        }
        try {
            byte[] data = generalMessage.getData();
            if (data != null) {
                int optInt = new JSONObject(new String(data, "utf-8")).optInt("type");
                if (b.contains(Integer.valueOf(optInt))) {
                    return optInt;
                }
                Object[] objArr2 = {Integer.valueOf(optInt), generalMessage};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1aa49bfb3bfed3ba3fbe6c35d0b54072", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1aa49bfb3bfed3ba3fbe6c35d0b54072");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("channel", String.valueOf((int) generalMessage.getChannel()));
                    hashMap.put("id", String.valueOf(generalMessage.getMsgId()));
                    hashMap.put("category", String.valueOf(generalMessage.getCategory()));
                    com.sankuai.waimai.business.im.common.log.b.a("custom_message", String.valueOf(optInt), "解析自定义消息异常", hashMap);
                }
                return 3;
            }
        } catch (Exception unused) {
        }
        return 3;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter
    public int getViewType(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e5a18c2b890bbd11e125d9484acd6b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e5a18c2b890bbd11e125d9484acd6b1")).intValue() : a(generalMessage);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void init(Context context) {
        com.meituan.android.ptcommonim.ptcard.b aVar;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "468f1b615946f9900e417d86f9a5f022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "468f1b615946f9900e417d86f9a5f022");
            return;
        }
        b.clear();
        this.c.put(0, new com.sankuai.waimai.business.im.common.message.b());
        this.c.put(1, new j());
        this.c.put(301, new com.sankuai.waimai.business.im.common.message.a(a()));
        Map<Integer, d> map = this.c;
        String str = this.i;
        Object[] objArr2 = {context, map, str};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d16a94e92219c4af5563dc9e3b244d23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d16a94e92219c4af5563dc9e3b244d23");
        } else {
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.ptcommonim.ptcard.c.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "58ff73e9e4dbd47cebb1e1c35a3be1af", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (com.meituan.android.ptcommonim.ptcard.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "58ff73e9e4dbd47cebb1e1c35a3be1af");
            } else {
                Object[] objArr4 = {context};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.ptcommonim.ptcard.a.a;
                aVar = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "047ab6556294212c5d987604b738c9ea", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.ptcommonim.ptcard.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "047ab6556294212c5d987604b738c9ea") : new com.meituan.android.ptcommonim.ptcard.a(context);
            }
            map.put(80001, new k(aVar.a(80001), str));
            map.put(80002, new k(aVar.a(80002), str));
            map.put(80003, new k(aVar.a(80003), str));
            map.put(80004, new k(aVar.a(80004), str));
        }
        a(this.c);
        this.c.put(3, new a());
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "92ff2fb6c1b4196312e907a382ab325d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "92ff2fb6c1b4196312e907a382ab325d");
        } else {
            b = new HashSet(this.c.keySet());
        }
    }

    public void a(Map<Integer, d> map) {
        boolean z;
        int a2;
        int i = 1;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a34ebce1dac029bf852b30242865a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a34ebce1dac029bf852b30242865a0");
        } else if (this.f != null && this.f.a && !com.sankuai.waimai.foundation.utils.b.b(this.f.c)) {
            for (WMCommonDataInfo.IMDynamicCard iMDynamicCard : this.f.c) {
                if (iMDynamicCard != null) {
                    WMCommonDataInfo.NativeVersion nativeVersion = iMDynamicCard.nativeVersion;
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = nativeVersion;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d557e3a77d6471aed3ce07f63e3b051c", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d557e3a77d6471aed3ce07f63e3b051c")).booleanValue();
                    } else {
                        if (nativeVersion != null) {
                            String i2 = com.sankuai.waimai.platform.b.A().i();
                            String str = "";
                            if (com.sankuai.waimai.foundation.core.a.d()) {
                                str = nativeVersion.wmVersion;
                            } else if (com.sankuai.waimai.foundation.core.a.e()) {
                                str = nativeVersion.mtVersion;
                            }
                            if (com.sankuai.waimai.mach.utils.e.a(i2, str) < 0) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (!z && (a2 = r.a(iMDynamicCard.msgCode, -1)) != -1 && TextUtils.equals(iMDynamicCard.nativeId, "mach")) {
                        map.put(Integer.valueOf(a2), new g(iMDynamicCard, this.g, this.h));
                    }
                    i = 1;
                }
            }
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e771f8d58f2fadeb7eadc077b5e56b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e771f8d58f2fadeb7eadc077b5e56b68");
        } else {
            this.c.clear();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a implements d {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.business.im.common.message.d
        public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        }

        public a() {
        }

        @Override // com.sankuai.waimai.business.im.common.message.d
        public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
            Object[] objArr = {context, bVar, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "306cfe88a3fd5e84a996faed7ea8e4e0", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "306cfe88a3fd5e84a996faed7ea8e4e0");
            }
            TextView textView = new TextView(context);
            int a2 = com.sankuai.waimai.foundation.utils.g.a(context, 5.0f);
            textView.setPadding(a2, a2, a2, a2);
            textView.setText(R.string.general_message_default_text);
            return textView;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements d {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.business.im.common.message.d
        public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        }

        public b() {
        }

        @Override // com.sankuai.waimai.business.im.common.message.d
        public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
            Object[] objArr = {context, bVar, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e1bf76281efe82c5bfee231c5ffb07", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e1bf76281efe82c5bfee231c5ffb07") : new View(context);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    @NonNull
    public View createView(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dfd447e9b0b9840db313c76baeed887", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dfd447e9b0b9840db313c76baeed887");
        }
        int viewType = getViewType(bVar.b);
        int i = this.c.containsKey(Integer.valueOf(viewType)) ? viewType : 3;
        if (this.c.get(Integer.valueOf(i)) == null) {
            return this.e.a(context, bVar, viewGroup);
        }
        return this.c.get(Integer.valueOf(i)).a(context, bVar, viewGroup);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    public void bindView(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f96c0a67546b386b6397d64270e99a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f96c0a67546b386b6397d64270e99a2");
            return;
        }
        int viewType = getViewType(bVar.b);
        if (!this.c.containsKey(Integer.valueOf(viewType))) {
            viewType = 3;
        }
        if (this.c.get(Integer.valueOf(viewType)) == null) {
            this.e.a(view, bVar);
        } else {
            this.c.get(Integer.valueOf(viewType)).a(view, bVar);
        }
    }
}
