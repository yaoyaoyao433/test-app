package com.meituan.android.legwork.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.gson.Gson;
import com.meituan.android.legwork.bean.im.IMInitializeData;
import com.meituan.android.legwork.bean.im.IMSendLocationFromH5Bean;
import com.meituan.android.legwork.bean.orderDetail.PrivacyPhoneBean;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.ui.adapter.GeneralMsgAdapter;
import com.meituan.android.legwork.ui.adapter.IMBannerAdapter;
import com.meituan.android.legwork.ui.adapter.IMLocationMsgAdapter;
import com.meituan.android.legwork.ui.dialog.PrivacyPhoneDegradeDialogFragment;
import com.meituan.android.legwork.ui.dialog.PrivacyPhoneDialogFragment;
import com.meituan.android.legwork.ui.view.CustomPlugin;
import com.meituan.android.legwork.ui.view.CustomTitleBarAdapt;
import com.meituan.android.legwork.ui.view.LocationPlugin;
import com.meituan.android.legwork.utils.ab;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.y;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.xm.im.message.bean.GPSMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.panel.plugin.CameraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import com.sankuai.xm.imui.common.panel.plugin.VideoPlugin;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.ImageMsgAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class IMSessionFragment extends SessionFragment {
    public static ChangeQuickRedirect a;
    public IMInitializeData b;
    private rx.subscriptions.b c;
    private PopupWindow d;
    private boolean e;
    private Map<String, Object> f;

    public IMSessionFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c84d8fadc4ddb852263ddf06b04bd6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c84d8fadc4ddb852263ddf06b04bd6");
            return;
        }
        this.e = true;
        this.f = new HashMap(4);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        com.sankuai.xm.imui.theme.b bVar;
        Resources resources;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85d8ba4c90e54dca85648e76d288545f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85d8ba4c90e54dca85648e76d288545f");
            return;
        }
        super.onCreate(bundle);
        if (this.b == null) {
            x.e("IMSessionFragment.onCreate()", "start activity error, cause: mImInitializeData is null");
            getActivity().finish();
            return;
        }
        com.meituan.android.legwork.common.im.f b = com.meituan.android.legwork.common.im.f.b();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.common.im.a.a;
        if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "767ec85ca5455a819e3b0732ee1f5468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "767ec85ca5455a819e3b0732ee1f5468");
        } else {
            b.d = this;
            if (b.c != null && !b.c.isUnsubscribed()) {
                b.c.a();
            }
            rx.d a2 = com.meituan.android.legwork.common.bus.a.a().a(com.meituan.android.legwork.common.bus.event.c.class);
            Object[] objArr3 = {b};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.common.im.b.a;
            b.a(a2.c(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e02c2ba881aa22a844aff508e145d532", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e02c2ba881aa22a844aff508e145d532") : new com.meituan.android.legwork.common.im.b(b)));
        }
        com.meituan.android.legwork.common.im.g.a().a(this.b);
        com.sankuai.xm.imui.session.b b2 = com.sankuai.xm.imui.session.b.b(getActivity());
        if (b2 != null) {
            Object[] objArr4 = {this};
            ChangeQuickRedirect changeQuickRedirect4 = a.a;
            b2.a(com.sankuai.xm.imui.session.event.a.class, PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "fa35eaff843bd58b7aed1b8bc4ab3b54", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.xm.base.callback.c) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "fa35eaff843bd58b7aed1b8bc4ab3b54") : new a(this), true);
        }
        com.sankuai.xm.ui.a a3 = com.sankuai.xm.ui.a.a();
        short t = t();
        com.meituan.android.legwork.common.im.f b3 = com.meituan.android.legwork.common.im.f.b();
        Context context = getContext();
        Object[] objArr5 = {context};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.legwork.common.im.f.e;
        if (PatchProxy.isSupport(objArr5, b3, changeQuickRedirect5, false, "7fef463dd2a31ef4c08c5345bdbd39ac", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (com.sankuai.xm.imui.theme.b) PatchProxy.accessDispatch(objArr5, b3, changeQuickRedirect5, false, "7fef463dd2a31ef4c08c5345bdbd39ac");
        } else {
            Object[] objArr6 = {context};
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.legwork.common.im.f.e;
            if (PatchProxy.isSupport(objArr6, b3, changeQuickRedirect6, false, "5e1aa0c8be0351f29b309d4e99a93c3f", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (com.sankuai.xm.imui.theme.b) PatchProxy.accessDispatch(objArr6, b3, changeQuickRedirect6, false, "5e1aa0c8be0351f29b309d4e99a93c3f");
            } else {
                bVar = new com.sankuai.xm.imui.theme.b();
                if (context != null && (resources = context.getResources()) != null) {
                    int color = resources.getColor(R.color.legwork_color_FFEFEFEF);
                    bVar.c(Integer.valueOf(color));
                    bVar.d(Integer.valueOf(color));
                    bVar.a(R.drawable.legwork_shape_im_send);
                    bVar.a(Integer.valueOf(resources.getColor(R.color.legwork_color_E6000000)));
                    bVar.b(Integer.valueOf(resources.getColor(R.color.legwork_color_FFFDFAEF)));
                }
            }
        }
        a3.a(t, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.meituan.android.legwork.bean.im.IMInitializeData] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static /* synthetic */ boolean a(IMSessionFragment iMSessionFragment, com.sankuai.xm.imui.session.event.a aVar) {
        ?? r5;
        Object[] objArr = {iMSessionFragment, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d406152fb18c338902b4d23599811ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d406152fb18c338902b4d23599811ca")).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        int i = aVar.b;
        int i2 = aVar.c;
        Intent intent = aVar.d;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, iMSessionFragment, changeQuickRedirect2, false, "fbe61bb4a2c6c05c585ae1bc979bbcaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iMSessionFragment, changeQuickRedirect2, false, "fbe61bb4a2c6c05c585ae1bc979bbcaa");
            return false;
        } else if (i2 != -1 || intent == null) {
            return false;
        } else {
            if (i != 100 && i != 102 && i != 104) {
                return false;
            }
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "resultData");
            if (TextUtils.isEmpty(a2)) {
                return false;
            }
            try {
                IMSendLocationFromH5Bean iMSendLocationFromH5Bean = (IMSendLocationFromH5Bean) new Gson().fromJson(a2, (Class<Object>) IMSendLocationFromH5Bean.class);
                if (iMSendLocationFromH5Bean == null) {
                    return false;
                }
                if (iMSendLocationFromH5Bean.code != 0) {
                    if (iMSendLocationFromH5Bean.code != 2 || TextUtils.isEmpty(iMSendLocationFromH5Bean.msg)) {
                        return false;
                    }
                    ab.a(iMSendLocationFromH5Bean.msg);
                    iMSessionFragment.f.put("status", "fail");
                    q.a("legwork_im_pick_location", 16, iMSessionFragment.f);
                    return false;
                }
                double parseDouble = !TextUtils.isEmpty(iMSendLocationFromH5Bean.lat) ? Double.parseDouble(iMSendLocationFromH5Bean.lat) : 0.0d;
                double parseDouble2 = TextUtils.isEmpty(iMSendLocationFromH5Bean.lng) ? 0.0d : Double.parseDouble(iMSendLocationFromH5Bean.lng);
                String str = "我的收货地址已更新，辛苦送到该位置";
                r5 = iMSessionFragment.b;
                try {
                    if (r5 != 0) {
                        switch (iMSessionFragment.b.businessType) {
                            case 1:
                                r5 = 1;
                                str = iMSessionFragment.getString(R.string.legwork_im_send_location_prompt_text, "收件地址");
                                break;
                            case 2:
                                r5 = 1;
                                str = iMSessionFragment.getString(R.string.legwork_im_send_location_prompt_text, "收货地址");
                                break;
                        }
                        TextMessage a3 = com.sankuai.xm.imui.common.util.c.a(str);
                        GPSMessage a4 = com.sankuai.xm.imui.common.util.c.a(parseDouble, parseDouble2, iMSendLocationFromH5Bean.poi, "");
                        a4.setCompatibleContent("用户发送了一个位置信息");
                        HashMap hashMap = new HashMap();
                        hashMap.put("poi_address", iMSendLocationFromH5Bean.address);
                        hashMap.put("view_url", iMSendLocationFromH5Bean.viewUrl);
                        a4.appendExtension(hashMap);
                        IMUIManager a5 = IMUIManager.a();
                        IMMessage[] iMMessageArr = new IMMessage[2];
                        iMMessageArr[0] = a3;
                        iMMessageArr[r5] = a4;
                        a5.a(Arrays.asList(iMMessageArr), false);
                        iMSessionFragment.f.put("status", "success");
                        q.a("legwork_im_pick_location", 16, iMSessionFragment.f);
                        return false;
                    }
                    r5 = 1;
                    TextMessage a32 = com.sankuai.xm.imui.common.util.c.a(str);
                    GPSMessage a42 = com.sankuai.xm.imui.common.util.c.a(parseDouble, parseDouble2, iMSendLocationFromH5Bean.poi, "");
                    a42.setCompatibleContent("用户发送了一个位置信息");
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("poi_address", iMSendLocationFromH5Bean.address);
                    hashMap2.put("view_url", iMSendLocationFromH5Bean.viewUrl);
                    a42.appendExtension(hashMap2);
                    IMUIManager a52 = IMUIManager.a();
                    IMMessage[] iMMessageArr2 = new IMMessage[2];
                    iMMessageArr2[0] = a32;
                    iMMessageArr2[r5] = a42;
                    a52.a(Arrays.asList(iMMessageArr2), false);
                    iMSessionFragment.f.put("status", "success");
                    q.a("legwork_im_pick_location", 16, iMSessionFragment.f);
                    return false;
                } catch (Exception e) {
                    e = e;
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = "parse result data error, resultData:" + a2 + ",exception msg:";
                    objArr3[r5] = e;
                    x.e("IMSessionFragment.onActivityResultEvent()", objArr3);
                    x.a(e);
                    return false;
                }
            } catch (Exception e2) {
                e = e2;
                r5 = 1;
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Context context;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13333958066085fec98c4639e7c87cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13333958066085fec98c4639e7c87cf");
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.b != null && this.b.showTips && !TextUtils.isEmpty(this.b.tips)) {
            a(false, this.b.tips);
        } else if (z.b(com.meituan.android.legwork.a.a(), "im_send_location_show", false) || !com.meituan.android.legwork.common.im.g.a().a(false) || (context = getContext()) == null) {
        } else {
            this.d = new PopupWindow(context);
            this.d.setContentView(LayoutInflater.from(context).inflate(R.layout.legwork_im_send_location_guide_view, (ViewGroup) null));
            this.d.setBackgroundDrawable(null);
            if (view.findViewById(R.id.extra_plugin) != null) {
                view.findViewById(R.id.extra_plugin).post(b.a(this, view));
            }
        }
    }

    public static /* synthetic */ void b(IMSessionFragment iMSessionFragment, View view) {
        Object[] objArr = {iMSessionFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44a8f64420a240027bd8691d0e346c93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44a8f64420a240027bd8691d0e346c93");
            return;
        }
        try {
            p.a(iMSessionFragment.d, view.findViewById(R.id.extra_plugin), -com.meituan.android.legwork.utils.h.a(5.5f), (-view.findViewById(R.id.extra_plugin).getHeight()) - com.meituan.android.legwork.utils.h.a(43));
            z.a(com.meituan.android.legwork.a.a(), "im_send_location_show", true);
            com.meituan.android.legwork.statistics.a.a(iMSessionFragment, "b_banma_j78c2ebc_mv", com.meituan.android.legwork.common.im.g.a().a(com.meituan.android.legwork.common.im.g.f), "c_q4u2ijua");
        } catch (Exception e) {
            e.printStackTrace();
            x.a(e);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e15390ae747bbe8228b62a2aeff3eb58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e15390ae747bbe8228b62a2aeff3eb58");
            return;
        }
        com.meituan.android.legwork.statistics.a.a(this, "c_q4u2ijua", e());
        super.onResume();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8193d9987ec7c32256faefa0fd32adcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8193d9987ec7c32256faefa0fd32adcf");
            return;
        }
        com.meituan.android.legwork.statistics.a.a(this, "c_q4u2ijua");
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Map<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1642c60b7f70a3d14b29d88fa3231c3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1642c60b7f70a3d14b29d88fa3231c3a");
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("businessType", Integer.valueOf(this.b != null ? this.b.businessType : 0));
        hashMap.put("order_id", this.b != null ? this.b.orderId : "");
        hashMap.put("order_status", Integer.valueOf(this.b != null ? this.b.orderStatus : 0));
        return hashMap;
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "106410297aac986b9bf76039e10cbc31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "106410297aac986b9bf76039e10cbc31");
            return;
        }
        this.e = z;
        super.a(z, str);
        com.meituan.android.legwork.common.im.g.a().c = !z ? 1 : 0;
        if (z || this.d == null || !this.d.isShowing()) {
            return;
        }
        p.b(this.d);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d30b95709d6897641c7b8b13eaed55b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d30b95709d6897641c7b8b13eaed55b");
            return;
        }
        com.meituan.android.legwork.common.im.f b = com.meituan.android.legwork.common.im.f.b();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.common.im.a.a;
        if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "9468bf5d8b76848536d25a5f3210a4de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "9468bf5d8b76848536d25a5f3210a4de");
        } else if (b.d == this) {
            if (b.c != null && !b.c.isUnsubscribed()) {
                b.c.a();
            }
            b.d = null;
            com.meituan.android.legwork.common.bus.a.a().a(new com.meituan.android.legwork.common.bus.event.b());
        }
        if (this.c != null && !this.c.isUnsubscribed()) {
            this.c.a();
        }
        if (this.d != null && this.d.isShowing()) {
            p.b(this.d);
        }
        com.meituan.android.legwork.common.im.g.a().a((IMInitializeData) null);
        super.onDestroy();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f90b303cd35ecbabe99a2924358a944", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f90b303cd35ecbabe99a2924358a944")).booleanValue();
        }
        HashMap hashMap = new HashMap(8);
        if (this.b.ext != null) {
            hashMap.putAll(this.b.ext);
        }
        hashMap.put("customerPhone", com.meituan.android.legwork.common.user.a.a().e());
        bVar.a().appendExtension(hashMap);
        this.f.put("status", "send");
        q.a("legwork_im_message", 16, this.f);
        return false;
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(final int i, com.sankuai.xm.imui.session.entity.b bVar) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b891aa28d9b6bc181f5516e14a1e4d58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b891aa28d9b6bc181f5516e14a1e4d58")).booleanValue();
        }
        if (i == 0) {
            this.f.put("status", "success");
        } else {
            switch (i) {
                case 948:
                case 949:
                case 950:
                    this.f.put("status", "error");
                    if (this.b != null) {
                        a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<IMInitializeData>() { // from class: com.meituan.android.legwork.ui.fragment.IMSessionFragment.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.legwork.net.subscriber.a
                            public final void a(boolean z2, int i2, String str) {
                            }

                            @Override // com.meituan.android.legwork.net.subscriber.a
                            public final /* synthetic */ void a(IMInitializeData iMInitializeData) {
                                IMInitializeData iMInitializeData2 = iMInitializeData;
                                Object[] objArr2 = {iMInitializeData2};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12a60ecc1ed568d4bad5d28b87dd6553", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12a60ecc1ed568d4bad5d28b87dd6553");
                                } else if (iMInitializeData2 != null) {
                                    switch (i) {
                                        case 948:
                                        case 949:
                                            if (!iMInitializeData2.showTips || TextUtils.isEmpty(iMInitializeData2.tips)) {
                                                return;
                                            }
                                            IMSessionFragment.this.a(false, iMInitializeData2.tips);
                                            return;
                                        case 950:
                                            ab.a(IMSessionFragment.this.getActivity(), "已为您更换骑手，请刷新页面");
                                            iMInitializeData2.orderId = IMSessionFragment.this.b.orderId;
                                            com.meituan.android.legwork.common.im.f.b().a(IMSessionFragment.this.getActivity(), iMInitializeData2);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getInitializeData(this.b.orderId).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
                        break;
                    }
                    break;
                default:
                    this.f.put("status", "error");
                    break;
            }
            q.a("legwork_im_message", 16, this.f);
            return z;
        }
        z = true;
        q.a("legwork_im_message", 16, this.f);
        return z;
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final TitleBarAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c586bdb6f0aa5d2e71ca0d7c3f8302c", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c586bdb6f0aa5d2e71ca0d7c3f8302c");
        }
        CustomTitleBarAdapt customTitleBarAdapt = new CustomTitleBarAdapt();
        customTitleBarAdapt.a(this.b == null ? "" : this.b.riderName);
        com.meituan.android.legwork.statistics.a.a(this, "b_8e1oxz3q", e(), "c_q4u2ijua");
        customTitleBarAdapt.a(c.a(this));
        return customTitleBarAdapt;
    }

    public static /* synthetic */ void a(IMSessionFragment iMSessionFragment, View view) {
        Object[] objArr = {iMSessionFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ad85bb86027fa1d6eaa0f9d13e2333c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ad85bb86027fa1d6eaa0f9d13e2333c");
            return;
        }
        com.meituan.android.legwork.statistics.a.a(iMSessionFragment, "b_pvvt0l56", "c_q4u2ijua", iMSessionFragment.e());
        IMInitializeData iMInitializeData = iMSessionFragment.b;
        if (iMInitializeData == null) {
            return;
        }
        final String str = iMInitializeData.orderId;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, iMSessionFragment, changeQuickRedirect2, false, "ddf4db51b03b7107769470977f736f37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iMSessionFragment, changeQuickRedirect2, false, "ddf4db51b03b7107769470977f736f37");
            return;
        }
        iMSessionFragment.f.put("status", "click");
        q.a("legwork_get_rider_privacy_phone", 32, iMSessionFragment.f);
        iMSessionFragment.a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<PrivacyPhoneBean>() { // from class: com.meituan.android.legwork.ui.fragment.IMSessionFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final /* synthetic */ void a(PrivacyPhoneBean privacyPhoneBean) {
                PrivacyPhoneBean privacyPhoneBean2 = privacyPhoneBean;
                Object[] objArr3 = {privacyPhoneBean2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1ddfd5535b0d883355ae3b82e810c548", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1ddfd5535b0d883355ae3b82e810c548");
                } else if (privacyPhoneBean2 == null) {
                    a(false, 1, "PrivacyPhoneBean is null");
                } else {
                    privacyPhoneBean2.cid = "c_q4u2ijua";
                    privacyPhoneBean2.orderId = str;
                    if (TextUtils.isEmpty(privacyPhoneBean2.riderPhoneNumber)) {
                        a(false, 2, "riderPhoneNumber 为空");
                    } else if (!Pattern.compile("[0-9]*").matcher(privacyPhoneBean2.riderPhoneNumber).matches()) {
                        a(false, 3, "riderPhoneNumber 不全是数字");
                    } else {
                        y.a().a(privacyPhoneBean2);
                        if (privacyPhoneBean2.isPrivacy) {
                            PrivacyPhoneDialogFragment.a(privacyPhoneBean2, IMSessionFragment.this.e()).show(IMSessionFragment.this.getFragmentManager(), "PrivacyPhoneDialogFragment");
                            IMSessionFragment.this.f.put("status", "success");
                        } else {
                            IMSessionFragment.this.a("隐私号服务系统维护中", "可使用您的真实号码继续呼叫", privacyPhoneBean2.riderPhoneNumber);
                            IMSessionFragment.this.f.put("status", "degrade");
                        }
                        q.a("legwork_get_rider_privacy_phone", 32, IMSessionFragment.this.f);
                    }
                }
            }

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final void a(boolean z, int i, String str2) {
                String str3;
                String str4;
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1a01afb3cd17f987edbf1f33a33be2b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1a01afb3cd17f987edbf1f33a33be2b0");
                    return;
                }
                PrivacyPhoneBean a2 = y.a().a(str);
                IMSessionFragment.this.f.put("status", "error");
                if (z) {
                    str3 = "网络环境异常,请重试！";
                    str4 = "网络环境异常";
                } else {
                    str3 = "隐私保护服务不稳定,请重试！";
                    str4 = "隐私保护服务不稳定";
                }
                q.a("legwork_get_rider_privacy_phone", 32, IMSessionFragment.this.f);
                if (a2 == null) {
                    ab.a(str3);
                } else if (a2.isPrivacy) {
                    PrivacyPhoneDialogFragment.a(a2, IMSessionFragment.this.e()).show(IMSessionFragment.this.getFragmentManager(), "PrivacyPhoneDialogFragment");
                } else {
                    IMSessionFragment.this.a(str4, "可使用您的真实号码继续呼叫", a2.riderPhoneNumber);
                }
            }
        }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getRiderPrivacyPhone(str).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.a
    public final IBannerAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764faaf893bfe46b8bdc5b03876d6684", RobustBitConfig.DEFAULT_VALUE) ? (IBannerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764faaf893bfe46b8bdc5b03876d6684") : new IMBannerAdapter(this.b);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final ISendPanelAdapter bo_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4058bdafb4dc6e493d8f00d95354d795", RobustBitConfig.DEFAULT_VALUE) ? (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4058bdafb4dc6e493d8f00d95354d795") : new DefaultSendPanelAdapter() { // from class: com.meituan.android.legwork.ui.fragment.IMSessionFragment.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
            public final int a(Context context) {
                return R.layout.legwork_im_send_panel_input_bar_default;
            }

            @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
            public View createView(Context context, ViewGroup viewGroup) {
                Object[] objArr2 = {context, viewGroup};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f36a7c8f6c7242504713722a430261c5", RobustBitConfig.DEFAULT_VALUE)) {
                    return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f36a7c8f6c7242504713722a430261c5");
                }
                View createView = super.createView(context, viewGroup);
                if (IMSessionFragment.this.b == null) {
                    return createView;
                }
                CustomPlugin customPlugin = (CustomPlugin) createView.findViewById(R.id.custom_plugin);
                if (IMSessionFragment.this.b.imTemplate != null && IMSessionFragment.this.b.imTemplate.size() > 0) {
                    customPlugin.setImTemplate(IMSessionFragment.this.b.imTemplate);
                    customPlugin.setCustomerKv(IMSessionFragment.this.e());
                    com.meituan.android.legwork.statistics.a.a(IMSessionFragment.this, "b_9ho4op3b", IMSessionFragment.this.e(), "c_q4u2ijua");
                } else {
                    customPlugin.setVisibility(8);
                }
                if (IMSessionFragment.this.b.funcConf == null || IMSessionFragment.this.b.funcConf.size() == 0) {
                    return createView;
                }
                ExtraPlugin extraPlugin = (ExtraPlugin) createView.findViewById(R.id.extra_plugin);
                ArrayList arrayList = new ArrayList();
                for (Integer num : IMSessionFragment.this.b.funcConf) {
                    switch (num.intValue()) {
                        case 1:
                            arrayList.add(new PhotoPlugin(context) { // from class: com.meituan.android.legwork.ui.fragment.IMSessionFragment.3.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
                                public int getPluginIcon() {
                                    return R.drawable.legwork_im_plugin_photo_compressed;
                                }

                                @Override // com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
                                public String getPluginName() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1888d562e22504b79fe896869a7efc4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1888d562e22504b79fe896869a7efc4") : getResources().getString(R.string.legwork_im_plugin_photo);
                                }
                            });
                            break;
                        case 2:
                            arrayList.add(new CameraPlugin(context) { // from class: com.meituan.android.legwork.ui.fragment.IMSessionFragment.3.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.imui.common.panel.plugin.CameraPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
                                public int getPluginIcon() {
                                    return R.drawable.legwork_im_plugin_camera_compressed;
                                }

                                @Override // com.sankuai.xm.imui.common.panel.plugin.CameraPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
                                public String getPluginName() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1053a9ee5d814943c05c897fa8d0ca41", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1053a9ee5d814943c05c897fa8d0ca41") : getResources().getString(R.string.legwork_im_plugin_camera);
                                }
                            });
                            break;
                        case 3:
                            arrayList.add(new VideoPlugin(context) { // from class: com.meituan.android.legwork.ui.fragment.IMSessionFragment.3.3
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.imui.common.panel.plugin.VideoPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
                                public int getPluginIcon() {
                                    return R.drawable.legwork_im_plugin_video;
                                }

                                @Override // com.sankuai.xm.imui.common.panel.plugin.VideoPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
                                public String getPluginName() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a9805ba4f0f5aff0571273adf5c32d96", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a9805ba4f0f5aff0571273adf5c32d96") : getResources().getString(R.string.legwork_im_plugin_video);
                                }
                            });
                            break;
                        case 4:
                            arrayList.add(new LocationPlugin(context));
                            break;
                    }
                }
                if (arrayList.size() > 0) {
                    extraPlugin.setPlugins(arrayList);
                }
                return createView;
            }

            @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
            public boolean onPluginEvent(Plugin plugin, int i, Object obj) {
                Object[] objArr2 = {plugin, Integer.valueOf(i), obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a3ef52a66e97ea4bf79718071fb21c9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a3ef52a66e97ea4bf79718071fb21c9")).booleanValue();
                }
                if (IMSessionFragment.this.d != null && IMSessionFragment.this.d.isShowing()) {
                    p.b(IMSessionFragment.this.d);
                }
                if ((plugin instanceof ExtraPlugin) && i == 196608 && !plugin.i() && IMSessionFragment.this.b != null && IMSessionFragment.this.b.funcConf != null && IMSessionFragment.this.b.funcConf.contains(4)) {
                    com.meituan.android.legwork.statistics.a.a(this, "b_banma_s01dzpzy_mv", com.meituan.android.legwork.common.im.g.a().a(com.meituan.android.legwork.common.im.g.f), "c_q4u2ijua");
                }
                return super.onPluginEvent(plugin, i, obj);
            }
        };
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final IMsgViewAdapter d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3098b31fb20dcf1df2f390af38752dc2", RobustBitConfig.DEFAULT_VALUE) ? (IMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3098b31fb20dcf1df2f390af38752dc2") : new IMsgViewAdapter() { // from class: com.meituan.android.legwork.ui.fragment.IMSessionFragment.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
            public ICommonAdapter getCommonAdapter() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c7f0f279608ed32f206bf20f372c247", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c7f0f279608ed32f206bf20f372c247") : new CommonAdapter() { // from class: com.meituan.android.legwork.ui.fragment.IMSessionFragment.4.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
                    public boolean hasLinkTextUnderLine(com.sankuai.xm.imui.session.entity.b bVar) {
                        return false;
                    }

                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
                    public boolean onTextLinkClick(View view, String str) {
                        return true;
                    }

                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
                    public int getAvatarCornerRadius(com.sankuai.xm.imui.session.entity.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a8786e2d0870f544b516f14eaba9e63c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a8786e2d0870f544b516f14eaba9e63c")).intValue() : getAvatarSize(bVar) / 2;
                    }

                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
                    public int getDefaultAvatarDrawableResource(com.sankuai.xm.imui.session.entity.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1bde3b5b2a3813f4eb191906f6f22d7", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1bde3b5b2a3813f4eb191906f6f22d7")).intValue();
                        }
                        int defaultAvatarDrawableResource = super.getDefaultAvatarDrawableResource(bVar);
                        switch (bVar.f()) {
                            case 1:
                                return R.drawable.legwork_im_rider_default_portrait;
                            case 2:
                                return R.drawable.legwork_im_default_portrait;
                            default:
                                return defaultAvatarDrawableResource;
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
                        if (r14.f() == 1) goto L22;
                     */
                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public int getBackgroundResource(com.sankuai.xm.imui.session.entity.b r14) {
                        /*
                            r13 = this;
                            r0 = 1
                            java.lang.Object[] r8 = new java.lang.Object[r0]
                            r9 = 0
                            r8[r9] = r14
                            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.legwork.ui.fragment.IMSessionFragment.AnonymousClass4.AnonymousClass1.a
                            java.lang.String r11 = "53239016730f5e9aa8cbb1c179e53f8e"
                            r4 = 0
                            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r1 = r8
                            r2 = r13
                            r3 = r10
                            r5 = r11
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                            if (r1 == 0) goto L22
                            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r10, r9, r11)
                            java.lang.Integer r14 = (java.lang.Integer) r14
                            int r14 = r14.intValue()
                            return r14
                        L22:
                            com.sankuai.xm.im.message.bean.IMMessage r1 = r14.a()
                            int r1 = com.sankuai.xm.imui.session.view.MsgViewType.a(r1)
                            r2 = 16
                            if (r1 != r2) goto L3c
                            com.sankuai.xm.im.message.bean.IMMessage r1 = r14.a()
                            boolean r1 = com.meituan.android.legwork.ui.adapter.GeneralMsgAdapter.b(r1)
                            if (r1 == 0) goto L3c
                            r14 = 2131428430(0x7f0b044e, float:1.8478504E38)
                            return r14
                        L3c:
                            com.meituan.android.legwork.common.im.f r8 = com.meituan.android.legwork.common.im.f.b()
                            java.lang.Object[] r10 = new java.lang.Object[r0]
                            r10[r9] = r14
                            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.legwork.common.im.f.e
                            java.lang.String r12 = "e6a4569a8ed124b7808d7f8193ea6bfe"
                            r4 = 0
                            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r1 = r10
                            r2 = r8
                            r3 = r11
                            r5 = r12
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                            r2 = 2130838095(0x7f02024f, float:1.7281163E38)
                            if (r1 == 0) goto L63
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r8, r11, r9, r12)
                            java.lang.Integer r0 = (java.lang.Integer) r0
                            int r9 = r0.intValue()
                            goto L85
                        L63:
                            int r1 = r14.f()
                            r3 = 2
                            if (r1 != r3) goto L7e
                            com.sankuai.xm.im.message.bean.IMMessage r0 = r14.a()
                            int r0 = com.sankuai.xm.imui.session.view.MsgViewType.a(r0)
                            r1 = 8
                            if (r0 != r1) goto L7a
                        L76:
                            r9 = 2130838095(0x7f02024f, float:1.7281163E38)
                            goto L85
                        L7a:
                            r9 = 2130838096(0x7f020250, float:1.7281165E38)
                            goto L85
                        L7e:
                            int r1 = r14.f()
                            if (r1 != r0) goto L85
                            goto L76
                        L85:
                            if (r9 != 0) goto L8c
                            int r14 = super.getBackgroundResource(r14)
                            return r14
                        L8c:
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.ui.fragment.IMSessionFragment.AnonymousClass4.AnonymousClass1.getBackgroundResource(com.sankuai.xm.imui.session.entity.b):int");
                    }

                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
                    public int getMsgStatusTextColor(com.sankuai.xm.imui.session.entity.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79bcc880dd142d0c3171a722c88435f8", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79bcc880dd142d0c3171a722c88435f8")).intValue();
                        }
                        Context a2 = a();
                        if (a2 == null || a2.getResources() == null) {
                            return super.getMsgStatusTextColor(bVar);
                        }
                        if (bVar != null && bVar.a() != null && bVar.a().getMsgStatus() != 16 && IMUIManager.f() && bVar.f() == 2) {
                            Resources resources = a2.getResources();
                            int color = resources.getColor(R.color.legwork_color_59000000);
                            int color2 = resources.getColor(R.color.legwork_color_FFFF6000);
                            if (bVar.a().getCategory() == 2) {
                                if (bVar.h() != 1) {
                                    return color2;
                                }
                            } else if (bVar.g() > 0) {
                                return color2;
                            }
                            return color;
                        }
                        return super.getMsgStatusTextColor(bVar);
                    }

                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
                    public int getNickNameVisibility(com.sankuai.xm.imui.session.entity.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "346460f6aaa8d605acc129ac9840f225", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "346460f6aaa8d605acc129ac9840f225")).intValue();
                        }
                        if (MsgViewType.a(bVar.a()) == 16 && GeneralMsgAdapter.a(bVar.a())) {
                            return 8;
                        }
                        return super.getNickNameVisibility(bVar);
                    }

                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
                    public int getAvatarVisibility(com.sankuai.xm.imui.session.entity.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "42198c1be2136a6aa26056eb98c8dc14", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "42198c1be2136a6aa26056eb98c8dc14")).intValue();
                        }
                        if (MsgViewType.a(bVar.a()) == 16 && GeneralMsgAdapter.c(bVar.a())) {
                            return 8;
                        }
                        return super.getAvatarVisibility(bVar);
                    }
                };
            }

            @Override // com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
            public IExtraAdapter getExtraAdapter(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "624df9bb18fadf7de1fbb5f8178ca491", RobustBitConfig.DEFAULT_VALUE)) {
                    return (IExtraAdapter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "624df9bb18fadf7de1fbb5f8178ca491");
                }
                if (i != 8) {
                    if (i != 16) {
                        switch (i) {
                            case 2:
                            case 3:
                                return new ImageMsgAdapter() { // from class: com.meituan.android.legwork.ui.fragment.IMSessionFragment.4.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.ImageMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IImageMsgAdapter
                                    @ColorInt
                                    public int getShapeBorderColor(com.sankuai.xm.imui.session.entity.b<ImageMessage> bVar) {
                                        Object[] objArr3 = {bVar};
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "744b2720d4313dd3d54b486453f8f69f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "744b2720d4313dd3d54b486453f8f69f")).intValue() : a().getResources().getColor(R.color.legwork_common_bg_color_transparent);
                                    }
                                };
                            default:
                                return null;
                        }
                    }
                    return new GeneralMsgAdapter();
                }
                return new IMLocationMsgAdapter();
            }
        };
    }

    private void a(rx.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "809d1558e625df7c9c1c0b14018f3654", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "809d1558e625df7c9c1c0b14018f3654");
            return;
        }
        if (this.c == null) {
            this.c = new rx.subscriptions.b();
        }
        this.c.a(kVar);
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe04d288a5f65078e17027eec449e9db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe04d288a5f65078e17027eec449e9db");
            return;
        }
        PrivacyPhoneDegradeDialogFragment a2 = PrivacyPhoneDegradeDialogFragment.a(str, str2, str3);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        a2.c = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "43e5b0a066106918eb4006a5b64a7612", RobustBitConfig.DEFAULT_VALUE) ? (PrivacyPhoneDegradeDialogFragment.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "43e5b0a066106918eb4006a5b64a7612") : new d(this);
        a2.show(getFragmentManager(), "PrivacyPhoneDegradeDialogFragment");
    }

    public static /* synthetic */ void a(IMSessionFragment iMSessionFragment, String str) {
        Object[] objArr = {iMSessionFragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c45f82f682ca79e3b48598f72ec38f4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c45f82f682ca79e3b48598f72ec38f4d");
            return;
        }
        com.meituan.android.legwork.utils.e.a(str);
        iMSessionFragment.f.put("type", "real");
        q.a("legwork_tel_phone_type", 32, iMSessionFragment.f);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd56dc0cb79e170409e776ad60217415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd56dc0cb79e170409e776ad60217415");
            return;
        }
        super.a(z);
        if (this.e) {
            a(com.meituan.android.legwork.common.im.f.b().a(this.b.orderId, String.valueOf(this.b.peerId), com.sankuai.xm.imui.b.a().f()));
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57803a8af89082bcfda6f6b6b2e2d50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57803a8af89082bcfda6f6b6b2e2d50a");
        } else if (this.b == null || TextUtils.isEmpty(this.b.informMsg)) {
        } else {
            GeneralMessage a2 = com.sankuai.xm.imui.common.util.c.a(this.b.informMsg.getBytes(), 1);
            a2.setChatId(com.sankuai.xm.imui.b.a().d());
            a2.setCategory(com.sankuai.xm.imui.b.a().e());
            a2.setPeerUid(com.sankuai.xm.imui.b.a().f().c());
            a2.setToUid(com.sankuai.xm.imui.b.a().d());
            a2.setToAppId(com.sankuai.xm.imui.b.a().g());
            a2.setPeerAppId(com.sankuai.xm.imui.b.a().g());
            a2.setMsgStatus(9);
            a2.setSts(com.meituan.android.time.c.b());
            a2.setChannel(com.sankuai.xm.imui.b.a().f().d());
            IMUIManager.a().c(a2);
        }
    }
}
