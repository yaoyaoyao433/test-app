package com.meituan.android.legwork.ui.view;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.legwork.bean.im.IMMsgTemplate;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CustomPlugin extends Plugin {
    public static ChangeQuickRedirect a;
    private List<IMMsgTemplate> b;
    private Map<String, Object> c;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.legwork_im_chat_msg_template_btn;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public CharSequence getPluginName() {
        return null;
    }

    public void setImTemplate(List<IMMsgTemplate> list) {
        if (list != null) {
            this.b = list;
        }
    }

    public void setCustomerKv(Map<String, Object> map) {
        if (map != null) {
            this.c = map;
        }
    }

    public CustomPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "106666415d02a824c18b202373368d44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "106666415d02a824c18b202373368d44");
        } else {
            this.b = new ArrayList();
        }
    }

    public CustomPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c758dc83b5267a98f2f0f54ca85b42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c758dc83b5267a98f2f0f54ca85b42");
        } else {
            this.b = new ArrayList();
        }
    }

    public CustomPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b23bc4d12cc111fd1d85623460575b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b23bc4d12cc111fd1d85623460575b2");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e83bcdddd438c37b943798cf75af74ff", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e83bcdddd438c37b943798cf75af74ff") : new b(getContext(), this.b, this.c);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45cc26b39da728755312b44f63a3c9b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45cc26b39da728755312b44f63a3c9b8");
        } else {
            b(1);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6966fba4cfdb53f30fc2d0709467c645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6966fba4cfdb53f30fc2d0709467c645");
        } else {
            b(0);
        }
    }
}
