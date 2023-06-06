package com.meituan.android.legwork.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GeneralMsgAdapter implements IGeneralMsgAdapter {
    public static ChangeQuickRedirect a;
    private Set<Integer> b;
    private Map<Integer, f> c;

    public GeneralMsgAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40c2889adddfc507e5393bdf6297347b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40c2889adddfc507e5393bdf6297347b");
            return;
        }
        this.b = new HashSet();
        this.c = new HashMap();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94838b090ec93a0492a5e5c90f5b0fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94838b090ec93a0492a5e5c90f5b0fcd");
            return;
        }
        this.b.clear();
        this.c.clear();
        this.c.put(1, new c());
        this.c.put(2, new d());
        this.c.put(1001, new a());
        this.b = this.c.keySet();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea416801f6e2bc79cdcae54c9ac4ba0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea416801f6e2bc79cdcae54c9ac4ba0e");
            return;
        }
        this.c.clear();
        this.b.clear();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    @NonNull
    public View createView(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f64ea9cd6955c521a2615e6bf5727c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f64ea9cd6955c521a2615e6bf5727c3");
        }
        int viewType = getViewType(bVar.a());
        if (this.c.get(Integer.valueOf(viewType)) == null) {
            viewType = 1;
        }
        if (this.c.get(Integer.valueOf(viewType)) == null) {
            init(context);
            x.e("GeneralMsgAdapter.createView()", "mGeneralTypeMap.get(type) is null");
        }
        return this.c.get(Integer.valueOf(viewType)).a(context, bVar, viewGroup);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    public void bindView(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18b8fda31f843a58113f27adcf9d975d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18b8fda31f843a58113f27adcf9d975d");
            return;
        }
        int viewType = getViewType(bVar.a());
        if (this.c.get(Integer.valueOf(viewType)) == null) {
            viewType = 1;
        }
        if (this.c.get(Integer.valueOf(viewType)) == null) {
            init(null);
            x.e("GeneralMsgAdapter.bindView()", "mGeneralTypeMap.get(type) is null");
        }
        this.c.get(Integer.valueOf(viewType)).a(view, bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter
    public Set<Integer> getViewTypes() {
        return this.b;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter
    public int getViewType(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8638432b7f8da12c7fb400f10baf9d22", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8638432b7f8da12c7fb400f10baf9d22")).intValue() : generalMessage.getType();
    }

    public static boolean a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f2ecaa348524987603fe8203c841e9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f2ecaa348524987603fe8203c841e9e")).booleanValue();
        }
        if (iMMessage != null && (iMMessage instanceof GeneralMessage)) {
            int type = ((GeneralMessage) iMMessage).getType();
            if (type != 1001) {
                switch (type) {
                    case 1:
                    case 2:
                        return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01259b4a81467345f9b752f223321f4e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01259b4a81467345f9b752f223321f4e")).booleanValue();
        }
        if (iMMessage != null && (iMMessage instanceof GeneralMessage)) {
            int type = ((GeneralMessage) iMMessage).getType();
            if (type != 1001) {
                switch (type) {
                    case 1:
                    case 2:
                        return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean c(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ce5d6d8f95de704479f40a4cf69e307", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ce5d6d8f95de704479f40a4cf69e307")).booleanValue();
        }
        if (iMMessage != null && (iMMessage instanceof GeneralMessage)) {
            int type = ((GeneralMessage) iMMessage).getType();
            if (type != 1001) {
                switch (type) {
                    case 1:
                    case 2:
                        return true;
                }
            }
            return false;
        }
        return true;
    }
}
