package com.meituan.android.ptcommonim.pageadapter.sendpanel;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.hhmedic.android.sdk.module.video.data.Log;
import com.meituan.android.ptcommonim.base.mach.a;
import com.meituan.android.ptcommonim.model.PTSessionInfo;
import com.meituan.android.ptcommonim.model.TemplateInfo;
import com.meituan.android.ptcommonim.pageadapter.message.mach.f;
import com.meituan.android.ptcommonim.pageadapter.sendpanel.plugin.PTCameraPlugin;
import com.meituan.android.ptcommonim.pageadapter.sendpanel.plugin.PTPhotoPlugin;
import com.meituan.android.ptcommonim.pageadapter.sendpanel.plugin.PTVideoPlugin;
import com.meituan.android.ptcommonim.pageadapter.v2.b;
import com.meituan.android.ptcommonim.pageadapter.widget.PTFrameMachContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter;
import com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import com.sankuai.xm.imui.common.panel.plugin.VoicePlugin;
import com.sankuai.xm.imui.session.SessionFragment;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTSendPanelAdapter extends DefaultSendPanelAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final int a(Context context) {
        return R.layout.ptim_sendpanel_layout;
    }

    public List<String> a() {
        return null;
    }

    public b c(Context context) {
        return null;
    }

    public List<PTPlugin> b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad7f263154c7dd8b1a5c109ff4eca32d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad7f263154c7dd8b1a5c109ff4eca32d") : new ArrayList();
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public final View createView(Context context, ViewGroup viewGroup) {
        f b;
        View view;
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b4e278e872992fbf8726192c8065291", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b4e278e872992fbf8726192c8065291");
        }
        View createView = super.createView(context, viewGroup);
        List<String> a2 = a();
        VoicePlugin voicePlugin = (VoicePlugin) createView.findViewById(R.id.voice_plugin);
        if (a2 != null && a2.contains("voice")) {
            voicePlugin.setVisibility(8);
            com.meituan.android.ptcommonim.utils.f.a(context, true);
        } else {
            com.meituan.android.ptcommonim.utils.f.a(context, false);
        }
        ExtraPlugin extraPlugin = (ExtraPlugin) createView.findViewById(R.id.extra_plugin);
        ArrayList arrayList = new ArrayList();
        if (a2 == null || !a2.contains("picture")) {
            arrayList.add(new PTPhotoPlugin(context));
        }
        if (a2 == null || !a2.contains(WmChooseMediaModule.TYPE_CAMERA)) {
            arrayList.add(new PTCameraPlugin(context));
        }
        if (a2 == null || !a2.contains(Log.LogStatus.VIDEO_RECORD)) {
            arrayList.add(new PTVideoPlugin(context));
        }
        List<PTPlugin> b2 = b(context);
        if (!CollectionUtils.isEmpty(b2)) {
            arrayList.addAll(b2);
        }
        if (extraPlugin != null) {
            extraPlugin.setPlugins(arrayList);
        }
        b c = c(context);
        if (c != null) {
            Object[] objArr2 = {context, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, c, changeQuickRedirect2, false, "9c1cd3e507d467761298c0a0d14f11fd", RobustBitConfig.DEFAULT_VALUE)) {
                view = (View) PatchProxy.accessDispatch(objArr2, c, changeQuickRedirect2, false, "9c1cd3e507d467761298c0a0d14f11fd");
            } else {
                PTFrameMachContainer pTFrameMachContainer = new PTFrameMachContainer(context);
                Object[] objArr3 = {context};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, c, changeQuickRedirect3, false, "5c1d47bacc2078cb09831d1ca36d618d", RobustBitConfig.DEFAULT_VALUE)) {
                    b = (f) PatchProxy.accessDispatch(objArr3, c, changeQuickRedirect3, false, "5c1d47bacc2078cb09831d1ca36d618d");
                } else {
                    f.a aVar = new f.a();
                    aVar.a(new a());
                    aVar.a(context);
                    aVar.d = new com.meituan.android.ptcommonim.pageadapter.message.mach.a(context);
                    aVar.a(new com.meituan.android.ptcommonim.bridge.b(context));
                    b = aVar.b(context);
                }
                pTFrameMachContainer.setMachProxy(b);
                Object[] objArr4 = {context};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.ptcommonim.utils.a.a;
                Activity activity = null;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "97c97eade11e8aca6106808286f10884", RobustBitConfig.DEFAULT_VALUE)) {
                    activity = (Activity) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "97c97eade11e8aca6106808286f10884");
                } else {
                    SessionFragment a3 = com.sankuai.xm.imui.session.b.a(context);
                    if (a3 != null) {
                        activity = a3.getActivity();
                    }
                }
                pTFrameMachContainer.a(activity, TemplateInfo.getModuleMachInfo(c.b.templateInfoList, PTSessionInfo.MODULE_CONVENIENT), com.meituan.android.ptcommonim.utils.b.a(context, c.b.convenientModule));
                view = pTFrameMachContainer;
            }
            ((ViewGroup) createView.findViewById(R.id.sendpanel_top_container).findViewById(R.id.sendpanel_top_container)).addView(view);
        }
        return createView;
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eea8cf6f8cb06d22cc2ee015ffe0e71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eea8cf6f8cb06d22cc2ee015ffe0e71");
        } else {
            super.destroy();
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public boolean onPluginEvent(Plugin plugin, int i, Object obj) {
        Object[] objArr = {plugin, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b82a2f3980b8e8dfb1389ee304a0c3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b82a2f3980b8e8dfb1389ee304a0c3")).booleanValue() : super.onPluginEvent(plugin, i, obj);
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public void onInputStateChange(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39097cacad8bdf5e22d46f1bc36b12f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39097cacad8bdf5e22d46f1bc36b12f9");
        } else {
            super.onInputStateChange(i, obj);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e3a7e6c1d7ddf533c70652d5d4d1fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e3a7e6c1d7ddf533c70652d5d4d1fac");
        } else {
            super.a(str);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee02ec915159a10f2fccd48ad891804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee02ec915159a10f2fccd48ad891804");
        } else {
            super.a(z, str);
        }
    }
}
