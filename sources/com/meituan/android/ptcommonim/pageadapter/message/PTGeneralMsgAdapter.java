package com.meituan.android.ptcommonim.pageadapter.message;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.ptcommonim.feedback.FeedbackCard;
import com.meituan.android.ptcommonim.pageadapter.message.utils.c;
import com.meituan.android.ptcommonim.pageadapter.message.view.PTIMMachRootView;
import com.meituan.android.ptcommonim.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTGeneralMsgAdapter implements IGeneralMsgAdapter {
    public static ChangeQuickRedirect a;
    private static final List<Integer> b = Arrays.asList(Integer.valueOf(c.a), Integer.valueOf(c.d), Integer.valueOf(c.f), Integer.valueOf(c.g), Integer.valueOf(c.h), Integer.valueOf(c.c), Integer.valueOf(c.e), Integer.valueOf(c.b), Integer.valueOf(c.i), Integer.valueOf(c.j));
    private final Map<String, Integer> c;
    private com.meituan.android.ptcommonim.pageadapter.base.a d;

    public PTGeneralMsgAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7096bdad88f27a1f70030204a2ac5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7096bdad88f27a1f70030204a2ac5b");
        } else {
            this.c = new HashMap(32);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public final void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9653ee54b6c4f5595ba9045f2f5a3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9653ee54b6c4f5595ba9045f2f5a3b");
        } else {
            this.d = a(context);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    @NonNull
    public final View createView(Context context, b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87b4f2c19b647b7494f3a187febc6d21", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87b4f2c19b647b7494f3a187febc6d21");
        }
        int type = bVar.a().getType();
        if (type == 1060060975) {
            return this.d.a(context, bVar, viewGroup);
        }
        if (b.contains(Integer.valueOf(type))) {
            return this.d.a(context, bVar, viewGroup);
        }
        Object[] objArr2 = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdb76640f01bb8146a1dfee4daa79a29", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdb76640f01bb8146a1dfee4daa79a29") : new View(context);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    public final void bindView(View view, b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26efa55f34ca04fc4e5958cbe85edac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26efa55f34ca04fc4e5958cbe85edac0");
        } else if (view instanceof PTIMMachRootView) {
            this.d.a(view, bVar);
        } else if (view instanceof FeedbackCard) {
            this.d.a(view, bVar);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter
    public final Set<Integer> getViewTypes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f260117c74a5de0244c82255118a23", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f260117c74a5de0244c82255118a23");
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 1000; i++) {
            hashSet.add(Integer.valueOf(1060060975 + i));
        }
        hashSet.addAll(b);
        return hashSet;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter
    public final int getViewType(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c3b87941403b3529f30c654ce54c8d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c3b87941403b3529f30c654ce54c8d")).intValue();
        }
        int type = generalMessage.getType();
        if (type != 1060060975) {
            if (b.contains(Integer.valueOf(type))) {
                return type;
            }
            return 0;
        }
        Object[] objArr2 = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        String a2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9d36baf0f850008ba36c26ea8fdf5aea", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9d36baf0f850008ba36c26ea8fdf5aea") : e.a(generalMessage, "platformData/template/authorizeCode");
        if (this.c.containsKey(a2)) {
            return this.c.get(a2).intValue() + 1060060975;
        }
        int size = this.c.size();
        this.c.put(a2, Integer.valueOf(size));
        return size + 1060060975;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public final void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6c90ce83a2a1e7ca8126a61378bb595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6c90ce83a2a1e7ca8126a61378bb595");
        } else if (this.d != null) {
            com.meituan.android.ptcommonim.pageadapter.base.a aVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.pageadapter.base.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1d2020bf1af56f6dc2f23c363e902631", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1d2020bf1af56f6dc2f23c363e902631");
                return;
            }
            for (Map.Entry<String, com.meituan.android.ptcommonim.pageadapter.message.item.a> entry : aVar.c.entrySet()) {
                com.meituan.android.ptcommonim.pageadapter.message.item.a value = entry.getValue();
                if (value instanceof com.meituan.android.ptcommonim.pageadapter.message.item.b) {
                    com.meituan.android.ptcommonim.pageadapter.message.item.b bVar = (com.meituan.android.ptcommonim.pageadapter.message.item.b) value;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.ptcommonim.pageadapter.message.item.b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "5e646c7f408bb250d2881ccca917ac74", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "5e646c7f408bb250d2881ccca917ac74");
                    } else if (bVar.k != null && bVar.k.b != null) {
                        bVar.k.b.release();
                    }
                }
            }
            aVar.c.clear();
        }
    }

    public com.meituan.android.ptcommonim.pageadapter.base.a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51721d787e15d0255f5d1f1ec2e7f583", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.ptcommonim.pageadapter.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51721d787e15d0255f5d1f1ec2e7f583");
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bd80e737f33734dbcad31df202474f7", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.ptcommonim.pageadapter.message.mach.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bd80e737f33734dbcad31df202474f7") : new com.meituan.android.ptcommonim.pageadapter.message.mach.b(context);
    }
}
