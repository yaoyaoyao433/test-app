package com.meituan.android.ptcommonim;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.JsonObject;
import com.meituan.android.ptcommonim.model.PTSessionInfo;
import com.meituan.android.ptcommonim.model.PTTransformBean;
import com.meituan.android.ptcommonim.pageadapter.message.PTMsgViewAdapter;
import com.meituan.android.ptcommonim.pageadapter.sendpanel.PTSendPanelAdapter;
import com.meituan.android.ptcommonim.pageadapter.titlebar.PTTitleBarAdapter;
import com.meituan.android.ptcommonim.pageadapter.v2.PTMsgViewAdapterV2;
import com.meituan.android.ptcommonim.pageadapter.v2.PTSendPanelAdapterV2;
import com.meituan.android.ptcommonim.pageadapter.v2.PTTitleBarAdapterV2;
import com.meituan.android.ptcommonim.pageadapter.widget.e;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTSessionFragmentV2 extends PTSessionFragment {
    public static ChangeQuickRedirect e;
    public PTSendPanelAdapterV2 f;
    private PTSessionInfo i;
    private PTTransformBean j;
    private com.meituan.android.ptcommonim.custombus.a k;
    private PTMsgViewAdapterV2 l;

    @Override // com.meituan.android.ptcommonim.PTSessionFragment
    public final /* synthetic */ PTMsgViewAdapter f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8496a92a3512f66d233120bbb2df5de", RobustBitConfig.DEFAULT_VALUE)) {
            return (PTMsgViewAdapterV2) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8496a92a3512f66d233120bbb2df5de");
        }
        if (this.l == null) {
            this.l = new PTMsgViewAdapterV2(this.i);
        }
        return this.l;
    }

    @Override // com.meituan.android.ptcommonim.PTSessionFragment
    public final /* synthetic */ PTSendPanelAdapter g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77407fe7041efc6f2027cf3aa50fcfa5", RobustBitConfig.DEFAULT_VALUE)) {
            return (PTSendPanelAdapterV2) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77407fe7041efc6f2027cf3aa50fcfa5");
        }
        if (this.f == null) {
            this.f = new PTSendPanelAdapterV2(this.i);
        }
        return this.f;
    }

    @Override // com.meituan.android.ptcommonim.PTSessionFragment, com.meituan.android.ptcommonim.protocol.PTProtocolSessionFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        e eVar;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279361255df93ee24799c3424cf2eb7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279361255df93ee24799c3424cf2eb7f");
            return;
        }
        super.onCreate(bundle);
        this.b = com.sankuai.xm.imui.session.b.b(getContext());
        SessionParams a = SessionParams.a(getContext());
        this.i = (PTSessionInfo) JsonHelper.fromJsonString(a.a().getString(PTSessionInfo.PT_SESSION_INFO), PTSessionInfo.class);
        this.j = (PTTransformBean) JsonHelper.fromJsonString(a.a().getString(PTTransformBean.PT_TRANSFORM_INFO), PTTransformBean.class);
        this.j.merchantIdStr = this.i.merchantInfo != null ? this.i.merchantInfo.merchantIdStr : "";
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38ecdbc1a13785db09037aa2dfa65d3c", RobustBitConfig.DEFAULT_VALUE)) {
            eVar = (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38ecdbc1a13785db09037aa2dfa65d3c");
        } else {
            List<com.sankuai.xm.imui.common.widget.b> d = com.sankuai.xm.imui.b.a().b().d();
            if (d != null && d.size() > 0) {
                for (com.sankuai.xm.imui.common.widget.b bVar : d) {
                    if (bVar instanceof e) {
                        eVar = (e) bVar;
                        break;
                    }
                }
            }
            eVar = null;
        }
        if (eVar == null || !this.j.isValid()) {
            return;
        }
        SessionId sessionId = this.d;
        PTTransformBean pTTransformBean = this.j;
        eVar.b = sessionId;
        eVar.c = pTTransformBean;
    }

    @Override // com.meituan.android.ptcommonim.PTSessionFragment, com.meituan.android.ptcommonim.protocol.PTProtocolSessionFragment, com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d590798ec5dcc959fc0138e6cd45bc96", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d590798ec5dcc959fc0138e6cd45bc96") : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43cc3fc3c7979d0c7e97d007b776936d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43cc3fc3c7979d0c7e97d007b776936d");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9b6bb7fe668c1de433e99266d8f0169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9b6bb7fe668c1de433e99266d8f0169");
        } else {
            this.k = new com.meituan.android.ptcommonim.custombus.a(this, this.i.customerServiceInfo);
            com.sankuai.xm.d.d().a(this.k);
        }
        new Handler(Looper.getMainLooper()).postDelayed(d.a(this), 500L);
    }

    public static /* synthetic */ void a(PTSessionFragmentV2 pTSessionFragmentV2) {
        Object[] objArr = {pTSessionFragmentV2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c4abd0ad0e66335ea3c1bf649c8a6d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c4abd0ad0e66335ea3c1bf649c8a6d8");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, pTSessionFragmentV2, changeQuickRedirect2, false, "6fcd2f223b98d2d4ca95fb0885429464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pTSessionFragmentV2, changeQuickRedirect2, false, "6fcd2f223b98d2d4ca95fb0885429464");
        } else if (pTSessionFragmentV2.i == null || pTSessionFragmentV2.i.announceInfo == null || !(pTSessionFragmentV2.i.announceInfo instanceof JsonObject)) {
        } else {
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(PTIMMessageBeanEntity.PTOauthInfo.OAUTH_KEY_PLATFORM_TYPE, "tmp_guider_tip");
            jsonObject3.addProperty(PTIMMessageBeanEntity.PTOauthInfo.OAUTH_KEY_AUTH_CODE, "MTA1Ny0xNzA0LWRlZmF1bHQtdG1wX2d1aWRlcl90aXAtLTM3MTE0NDQzMi0zNzExNDQ0MzItMzcxMTQ0NDMyLQ==");
            jsonObject2.add(PTIMMessageBeanEntity.DATA_KEY_CARD, pTSessionFragmentV2.i.announceInfo);
            jsonObject2.add(PTIMMessageBeanEntity.DATA_KEY_TEMPLATE, jsonObject3);
            jsonObject.add("platformData", jsonObject2);
            com.meituan.android.ptcommonim.utils.e.a(pTSessionFragmentV2.d, com.sankuai.xm.imui.common.util.c.a(jsonObject.toString().getBytes(), 1060060975, "[" + JsonHelper.getString(pTSessionFragmentV2.i.announceInfo, "title") + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + JsonHelper.getString(pTSessionFragmentV2.i.announceInfo, "content")));
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8502ac0c976464e2c10b5bf1ba4edf29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8502ac0c976464e2c10b5bf1ba4edf29");
            return;
        }
        super.onDestroyView();
        if (this.k != null) {
            com.meituan.android.ptcommonim.custombus.a aVar = this.k;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.custombus.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e6566de4fca90adbbd2dee1bf879082c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e6566de4fca90adbbd2dee1bf879082c");
            } else if (aVar.c != null) {
                IMUIManager.a().a(aVar.c);
                aVar.c = null;
            }
            com.sankuai.xm.d.d().b(this.k);
        }
    }

    @Override // com.meituan.android.ptcommonim.PTSessionFragment
    public final PTTitleBarAdapter e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac63804b5bb59fde1947c35ebd22bd7", RobustBitConfig.DEFAULT_VALUE) ? (PTTitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac63804b5bb59fde1947c35ebd22bd7") : new PTTitleBarAdapterV2(getContext(), this.i);
    }

    public static Map<String, Object> a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cca1131683fcb29bd92328c4ee2ae68", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cca1131683fcb29bd92328c4ee2ae68") : com.meituan.android.ptcommonim.utils.b.a(context, true);
    }

    @Override // com.meituan.android.ptcommonim.protocol.PTProtocolSessionFragment, com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e2db57921900ba2d40145278637cb66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e2db57921900ba2d40145278637cb66")).booleanValue();
        }
        if (i == 78000) {
            return true;
        }
        return super.a(i, bVar);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4abb0afd7b262905bae412ecf266e0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4abb0afd7b262905bae412ecf266e0d");
        } else if (this.l != null) {
            PTMsgViewAdapterV2 pTMsgViewAdapterV2 = this.l;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = PTMsgViewAdapterV2.b;
            if (PatchProxy.isSupport(objArr2, pTMsgViewAdapterV2, changeQuickRedirect2, false, "48e3d5e29e83fa0872721d1cbaa06765", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, pTMsgViewAdapterV2, changeQuickRedirect2, false, "48e3d5e29e83fa0872721d1cbaa06765");
            } else if (pTMsgViewAdapterV2.c != null) {
                pTMsgViewAdapterV2.c.b = str;
            }
        }
    }
}
