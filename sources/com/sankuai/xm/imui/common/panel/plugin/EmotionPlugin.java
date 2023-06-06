package com.sankuai.xm.imui.common.panel.plugin;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.imui.common.panel.SendPanel;
import com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView;
import com.sankuai.xm.imui.common.processors.f;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.h;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class EmotionPlugin extends Plugin {
    public static ChangeQuickRedirect b;
    private List<com.sankuai.xm.imui.common.entity.a> a;
    private com.sankuai.xm.imui.common.processors.c c;
    private boolean d;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.xm_sdk_chat_smiley_btn;
    }

    public EmotionPlugin(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49394dfd92076bd78556b2d22f557b9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49394dfd92076bd78556b2d22f557b9b");
        }
    }

    public EmotionPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c458bf2865d0f1d316237aea4e1a47d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c458bf2865d0f1d316237aea4e1a47d");
        }
    }

    public EmotionPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66f225715657447a238b2d72d8eeced4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66f225715657447a238b2d72d8eeced4");
            return;
        }
        this.d = false;
        setPluginClickClosable(true);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a(SendPanel sendPanel) {
        Object[] objArr = {sendPanel};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8190c4b3450eaab2f5386d4c3872b3d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8190c4b3450eaab2f5386d4c3872b3d6");
            return;
        }
        if (getEmotions() != null) {
            this.c = new com.sankuai.xm.imui.common.processors.b(getContext(), getEmotions());
        } else if (getOptionConfigResource() != 0 && h.b(getContext(), getOptionConfigResource(), 0) != 0) {
            this.c = new com.sankuai.xm.imui.common.processors.b(getContext(), getOptionConfigResource());
        }
        if (this.c == null) {
            this.c = f.b().a(getContext());
        }
        if (getEmotions() == null) {
            setEmotions(this.c.a());
        }
        if (com.sankuai.xm.base.util.b.a(getEmotions())) {
            setVisibility(8);
        }
        sendPanel.setEmotionProcessor(this.c);
        super.a(sendPanel);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c972adf3002112a5b0c94298effaf317", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c972adf3002112a5b0c94298effaf317");
        }
        com.sankuai.xm.ui.service.b bVar = (com.sankuai.xm.ui.service.b) m.a(com.sankuai.xm.ui.service.b.class);
        if (bVar != null) {
            return bVar.a(layoutInflater.getContext(), viewGroup, this);
        }
        EmotionOptionView emotionOptionView = new EmotionOptionView(getContext());
        emotionOptionView.a(this);
        return emotionOptionView;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f578e71b0cf2428a80803563de2c7ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f578e71b0cf2428a80803563de2c7ed");
            return;
        }
        b(1);
        getSendPanel().a(false);
        getOptionView().post(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.plugin.EmotionPlugin.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78ccb1fc30112824a26ce69e93dbaed2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78ccb1fc30112824a26ce69e93dbaed2");
                } else {
                    ((EmotionOptionView) EmotionPlugin.this.getOptionView()).a();
                }
            }
        }));
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26734dfce08037b9c3a7c83b22494691", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26734dfce08037b9c3a7c83b22494691");
            return;
        }
        b(0);
        getSendPanel().a(true);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public String getPluginName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae385041a56ecbcf5172a787d39365d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae385041a56ecbcf5172a787d39365d") : getResources().getString(R.string.xm_sdk_app_plugin_emotion);
    }

    public void setEmotions(List<com.sankuai.xm.imui.common.entity.a> list) {
        this.a = list;
    }

    public List<com.sankuai.xm.imui.common.entity.a> getEmotions() {
        return this.a;
    }

    @Deprecated
    public void setEnableXiaoTuan(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "002833d75992e020144e2d2158a753a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "002833d75992e020144e2d2158a753a8");
        } else {
            d.d("setEnableXiaoTuan is deprecated.", new Object[0]);
        }
    }

    public final List<com.sankuai.xm.imui.common.entity.a> getEmotionsForPanel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84f41c9fdc43fd1f8b11af6434fa26a1", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84f41c9fdc43fd1f8b11af6434fa26a1");
        }
        ArrayList<com.sankuai.xm.imui.common.entity.a> arrayList = new ArrayList();
        if (!com.sankuai.xm.base.util.b.a(this.a)) {
            arrayList.addAll(this.a);
            if (!this.d) {
                ArrayList arrayList2 = new ArrayList();
                String string = getContext().getString(R.string.xm_sdk_smiley_default_big_emotion_name);
                for (com.sankuai.xm.imui.common.entity.a aVar : arrayList) {
                    if (TextUtils.equals(aVar.e, string) && aVar.d == 2) {
                        arrayList2.add(aVar);
                    }
                }
                arrayList.removeAll(arrayList2);
            }
        }
        return arrayList;
    }
}
