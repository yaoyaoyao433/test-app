package com.sankuai.waimai.store.im.base;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMInputEditor extends InputEditorPlugin {
    public static ChangeQuickRedirect a;

    public SGIMInputEditor(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0d8414c6852cd22b1694f09156b42a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0d8414c6852cd22b1694f09156b42a");
        }
    }

    public SGIMInputEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c01c852f6b3cd1d82f4ab863822eb1cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c01c852f6b3cd1d82f4ab863822eb1cc");
        }
    }

    public SGIMInputEditor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4842622ceac80c57e8d4476e0938cf22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4842622ceac80c57e8d4476e0938cf22");
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31dbd7b41d793d08203f237018664d3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31dbd7b41d793d08203f237018664d3c");
        }
        setIconResource(R.drawable.xm_sdk_bg_input);
        return super.b(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final boolean a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9fd3d141bbe5f508285332398b84d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9fd3d141bbe5f508285332398b84d0")).booleanValue();
        }
        if (i == 3 && com.sankuai.xm.imui.b.a().e() == 2) {
            return false;
        }
        return super.a(i, obj);
    }
}
