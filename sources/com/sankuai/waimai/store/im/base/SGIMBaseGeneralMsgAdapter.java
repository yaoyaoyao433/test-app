package com.sankuai.waimai.store.im.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SGIMBaseGeneralMsgAdapter implements IGeneralMsgAdapter {
    public static ChangeQuickRedirect a;
    @Nullable
    protected com.sankuai.waimai.store.expose.v2.a b;
    @Nullable
    protected Bundle c;
    protected Map<Integer, com.sankuai.waimai.business.im.common.message.d> d;

    public abstract void a();

    public SGIMBaseGeneralMsgAdapter(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle) {
        Object[] objArr = {aVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc383aaa0f52808859f6207ae34a28c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc383aaa0f52808859f6207ae34a28c");
            return;
        }
        this.d = new HashMap();
        this.b = aVar;
        this.c = bundle;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter
    public Set<Integer> getViewTypes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9624a7b3970bc8023e2d0b4223abd9", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9624a7b3970bc8023e2d0b4223abd9") : this.d.keySet();
    }

    public static int a(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "667dd487397f15ba39e709ebac5ac411", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "667dd487397f15ba39e709ebac5ac411")).intValue();
        }
        try {
            byte[] data = generalMessage.getData();
            if (data != null) {
                return new JSONObject(new String(data, "utf-8")).optInt("type", -999);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return -999;
    }

    @Nullable
    public static String b(GeneralMessage generalMessage) {
        byte[] data;
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d7cb18d4f0a50b276e1faca72ece3ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d7cb18d4f0a50b276e1faca72ece3ff");
        }
        if (generalMessage == null || (data = generalMessage.getData()) == null) {
            return "";
        }
        try {
            return new JSONObject(new String(data, "utf-8")).optString("text", "");
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return "";
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter
    public int getViewType(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc3fc79689a1abfdbe74992bc914bb2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc3fc79689a1abfdbe74992bc914bb2")).intValue() : a(generalMessage);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5089f0e6f9b9e585516b59d134c7ac32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5089f0e6f9b9e585516b59d134c7ac32");
            return;
        }
        a();
        this.d.put(-999, new com.sankuai.waimai.store.im.provider.a());
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ab6b09e1595a85863cd588e86395d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ab6b09e1595a85863cd588e86395d5");
        } else {
            this.d.clear();
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    @NonNull
    public View createView(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a8c22873075e188e2ee77279312b64", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a8c22873075e188e2ee77279312b64");
        }
        int viewType = getViewType(bVar.b);
        if (!this.d.containsKey(Integer.valueOf(viewType))) {
            viewType = -999;
        }
        return this.d.get(Integer.valueOf(viewType)).a(context, bVar, viewGroup);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    public void bindView(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c079b7c9cd7c7ffe0e76195cf4572ba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c079b7c9cd7c7ffe0e76195cf4572ba3");
            return;
        }
        int viewType = getViewType(bVar.b);
        if (!this.d.containsKey(Integer.valueOf(viewType))) {
            viewType = -999;
        }
        this.d.get(Integer.valueOf(viewType)).a(view, bVar);
    }
}
