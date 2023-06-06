package com.sankuai.waimai.business.im.common.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.plugin.ChooseLocationPlugin;
import com.sankuai.waimai.business.im.common.plugin.RewardRiderPlugin;
import com.sankuai.waimai.business.im.common.plugin.smartreply.SmartReplyPlugin;
import com.sankuai.waimai.business.im.common.plugin.smartreply.d;
import com.sankuai.waimai.business.im.model.i;
import com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter;
import com.sankuai.xm.imui.common.panel.plugin.CameraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.EmotionPlugin;
import com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin;
import com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import com.sankuai.xm.imui.common.panel.plugin.VoicePlugin;
import com.sankuai.xm.imui.common.panel.plugin.b;
import com.sankuai.xm.imui.common.util.l;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMSendPanelAdapter extends DefaultSendPanelAdapter {
    public static ChangeQuickRedirect a;
    public d b;
    protected InputEditorPlugin c;
    protected Plugin d;
    public EmotionPlugin e;
    private Plugin f;
    private Plugin g;
    private ExtraPlugin h;
    private i i;
    private Map<Integer, i> j;
    private int k;

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public int a(Context context) {
        return R.layout.wm_im_send_panel_input_bar;
    }

    public boolean a() {
        return false;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c61a051358c0d43f885b3ef9a6fa2d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c61a051358c0d43f885b3ef9a6fa2d7");
        }
    }

    public IMSendPanelAdapter(@Nullable d dVar, @Nullable i iVar, int i) {
        Object[] objArr = {dVar, iVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b52e2900a769a216457fb9f3103f51d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b52e2900a769a216457fb9f3103f51d");
            return;
        }
        this.b = dVar;
        this.i = iVar;
        this.k = i;
    }

    public IMSendPanelAdapter(@Nullable d dVar) {
        this(dVar, (i) null, 0);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "767cd011efc37b74df548f393ddbcc69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "767cd011efc37b74df548f393ddbcc69");
        }
    }

    public IMSendPanelAdapter(@Nullable d dVar, int i, @Nullable Map<Integer, i> map) {
        Object[] objArr = {dVar, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9cb876a121016cfe54164807df2aa41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9cb876a121016cfe54164807df2aa41");
            return;
        }
        this.b = dVar;
        this.k = i;
        this.j = map;
    }

    public IMSendPanelAdapter() {
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4013042530be2130eb786b351b031a93", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4013042530be2130eb786b351b031a93");
        }
        View createView = super.createView(context, viewGroup);
        Object[] objArr2 = {createView};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bad56f555fb025ab802cefa4cf3b50d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bad56f555fb025ab802cefa4cf3b50d");
        } else {
            ((SmartReplyPlugin) createView.findViewById(R.id.reply_plugin)).setConfigInfo(this.b);
        }
        this.c = (InputEditorPlugin) createView.findViewById(R.id.editor_plugin);
        if (this.b != null && this.b.a) {
            this.c.setDefaultFocused(true);
        }
        this.h = (ExtraPlugin) createView.findViewById(R.id.extra_plugin);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PhotoPlugin(context) { // from class: com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter.1
            @Override // com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
            public int getPluginIcon() {
                return R.drawable.wm_im_ic_plugin_photo;
            }
        });
        arrayList.add(new CameraPlugin(context) { // from class: com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter.2
            @Override // com.sankuai.xm.imui.common.panel.plugin.CameraPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
            public int getPluginIcon() {
                return R.drawable.wm_im_ic_plugin_camera;
            }
        });
        if (this.j != null && this.j.size() > 0) {
            if (this.j.get(1) != null) {
                arrayList.add(new ChooseLocationPlugin(context) { // from class: com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.im.common.plugin.ChooseLocationPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
                    @NonNull
                    public CharSequence getPluginName() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e29b5eefe72a2898bd0571cc2836e075", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e29b5eefe72a2898bd0571cc2836e075") : ((i) IMSendPanelAdapter.this.j.get(1)).b;
                    }
                });
            }
            if (this.j.get(2) != null) {
                arrayList.add(new RewardRiderPlugin(context, this.j.get(2).e) { // from class: com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.im.common.plugin.RewardRiderPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
                    @NonNull
                    public CharSequence getPluginName() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4ba086265ee0e52303eaad407f11d600", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4ba086265ee0e52303eaad407f11d600") : ((i) IMSendPanelAdapter.this.j.get(2)).b;
                    }
                });
            }
        } else if (this.i != null) {
            arrayList.add(new ChooseLocationPlugin(context));
        }
        this.h.setPlugins(arrayList);
        this.f = (Plugin) createView.findViewWithTag("SEND");
        if (this.f == null) {
            this.f = (Plugin) createView.findViewById(R.id.send_plugin);
        }
        this.d = (Plugin) createView.findViewById(R.id.voice_plugin);
        ((VoicePlugin) this.d).setReverse(true);
        this.g = (Plugin) createView.findViewWithTag("ALT:SEND");
        if (this.g == null) {
            this.g = this.d;
        }
        this.e = (EmotionPlugin) createView.findViewById(R.id.emotion_plugin);
        if (this.e != null && a()) {
            if (this.k == 1) {
                this.e.setVisibility(0);
            } else {
                this.e.setVisibility(8);
            }
        }
        return createView;
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public boolean onPluginEvent(Plugin plugin, int i, Object obj) {
        Object[] objArr = {plugin, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c59dbf52d51cb1b4a56567ccff0a24eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c59dbf52d51cb1b4a56567ccff0a24eb")).booleanValue();
        }
        if (plugin == null) {
            return false;
        }
        if (this.c == plugin && this.c.getVisibility() == 0) {
            if (i == 2 || (i == 65536 && (this.c instanceof b) && !TextUtils.isEmpty(this.c.getEditText().getText()))) {
                l.a(0, this.f);
                l.a(8, this.h);
            } else if (i == 1) {
                l.a(8, this.f);
                l.a(0, this.h);
            }
        } else if (this.d == plugin) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            if (i == 65536) {
                l.a(8, this.c, this.f);
                l.a(0, this.d);
                layoutParams.weight = 1.0f;
                layoutParams.width = 0;
                this.d.requestLayout();
            } else if (i == 131072) {
                l.a(0, this.c);
                layoutParams.weight = 0.0f;
                layoutParams.width = this.d.getResources().getDimensionPixelSize(R.dimen.wm_im_send_panel_ic_size);
                this.d.requestLayout();
            }
        }
        return false;
    }
}
