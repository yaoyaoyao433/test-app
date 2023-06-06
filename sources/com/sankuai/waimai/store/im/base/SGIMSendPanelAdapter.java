package com.sankuai.waimai.store.im.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter;
import com.sankuai.xm.imui.common.panel.plugin.CameraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin;
import com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import com.sankuai.xm.imui.common.panel.plugin.VoicePlugin;
import com.sankuai.xm.imui.common.util.l;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMSendPanelAdapter extends DefaultSendPanelAdapter {
    public static ChangeQuickRedirect a;
    public InputEditorPlugin b;
    protected Plugin c;
    protected Plugin d;
    protected Plugin e;
    protected ExtraPlugin f;
    protected Plugin g;
    private String h;

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public int a(Context context) {
        return R.layout.wm_sc_im_send_panel_input_bar;
    }

    public SGIMSendPanelAdapter(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88afc6fd90a096c82d2d7e629f101870", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88afc6fd90a096c82d2d7e629f101870");
            return;
        }
        this.h = "";
        this.h = str;
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64f88c9f1fa6a7427878a39d9c370c39", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64f88c9f1fa6a7427878a39d9c370c39");
        }
        View createView = super.createView(context, viewGroup);
        this.b = (InputEditorPlugin) createView.findViewById(R.id.editor_plugin);
        this.f = (ExtraPlugin) createView.findViewById(R.id.extra_plugin);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PhotoPlugin(context) { // from class: com.sankuai.waimai.store.im.base.SGIMSendPanelAdapter.1
            @Override // com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
            public int getPluginIcon() {
                return R.drawable.wm_im_ic_plugin_photo;
            }
        });
        arrayList.add(new CameraPlugin(context) { // from class: com.sankuai.waimai.store.im.base.SGIMSendPanelAdapter.2
            @Override // com.sankuai.xm.imui.common.panel.plugin.CameraPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
            public int getPluginIcon() {
                return R.drawable.wm_im_ic_plugin_camera;
            }
        });
        this.f.setPlugins(arrayList);
        this.c = (Plugin) createView.findViewWithTag("SEND");
        if (this.c == null) {
            this.c = (Plugin) createView.findViewById(R.id.send_plugin);
        }
        this.e = (Plugin) createView.findViewById(R.id.voice_plugin);
        ((VoicePlugin) this.e).setReverse(true);
        this.g = (Plugin) createView.findViewById(R.id.emotion_plugin);
        this.g.setVisibility(8);
        this.d = (Plugin) createView.findViewWithTag("ALT:SEND");
        if (this.d == null) {
            this.d = this.e;
        }
        return createView;
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public boolean onPluginEvent(Plugin plugin, int i, Object obj) {
        Object[] objArr = {plugin, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16b244db3ed145ce064aab09583c6751", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16b244db3ed145ce064aab09583c6751")).booleanValue();
        }
        if (plugin == null) {
            return false;
        }
        if (this.b == plugin && this.b.getVisibility() == 0) {
            if (i == 2 || (i == 65536 && (this.b instanceof com.sankuai.xm.imui.common.panel.plugin.b) && !TextUtils.isEmpty(this.b.getEditText().getText()))) {
                l.a(0, this.c);
                l.a(8, this.f);
            } else if (i == 1) {
                l.a(8, this.c);
                l.a(0, this.f);
            }
        } else if (this.e == plugin) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            if (i == 65536) {
                l.a(8, this.b, this.c);
                l.a(0, this.e);
                layoutParams.weight = 1.0f;
                layoutParams.width = 0;
                this.e.requestLayout();
            } else if (i == 131072) {
                l.a(0, this.b);
                layoutParams.weight = 0.0f;
                layoutParams.width = this.e.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_32);
                this.e.requestLayout();
            }
        }
        return false;
    }
}
