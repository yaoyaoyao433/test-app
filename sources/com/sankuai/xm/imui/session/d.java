package com.sankuai.xm.imui.session;

import android.content.Context;
import android.util.SparseIntArray;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.UNKnownMessage;
import com.sankuai.xm.imui.session.c;
import com.sankuai.xm.imui.session.view.BaseCommonView;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.UnknownMsgView;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends BaseAdapter {
    public static ChangeQuickRedirect a;
    private Context b;
    private c.a c;
    private c.b d;
    private com.sankuai.xm.imui.session.presenter.a e;
    private List<com.sankuai.xm.imui.session.entity.b> f;
    private SparseIntArray g;
    private SparseIntArray h;
    private IGeneralMsgAdapter i;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public d(Context context, c.a aVar, com.sankuai.xm.imui.session.presenter.a aVar2) {
        int i = 0;
        Object[] objArr = {context, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc57ca8b128e0d1ae067ab02f084158", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc57ca8b128e0d1ae067ab02f084158");
            return;
        }
        this.g = new SparseIntArray();
        this.h = new SparseIntArray();
        this.b = context;
        this.c = aVar;
        this.e = aVar2;
        this.f = aVar.c();
        this.d = aVar.d();
        int i2 = 0;
        for (Integer num : MsgViewType.b) {
            int intValue = num.intValue();
            if (intValue != 16) {
                this.h.put(intValue, i2);
                i2++;
            }
        }
        IExtraAdapter extraAdapter = this.d.u().getExtraAdapter(16);
        if (extraAdapter instanceof IGeneralMsgAdapter) {
            this.i = (IGeneralMsgAdapter) extraAdapter;
            Set<Integer> viewTypes = this.i.getViewTypes();
            if (viewTypes != null) {
                for (Integer num2 : viewTypes) {
                    this.g.put(num2.intValue(), i);
                    i++;
                }
                return;
            }
            this.g.put(0, 0);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1709977b9e6fc0dfb193cd6f13b25d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1709977b9e6fc0dfb193cd6f13b25d")).intValue() : this.f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (a(r1.getMessage()) == a(r0)) goto L15;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r26, android.view.View r27, android.view.ViewGroup r28) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.imui.session.d.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e559b4581023a56338d41646d92d4ed", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e559b4581023a56338d41646d92d4ed")).intValue() : (this.h.size() + this.g.size()) * 3;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de8ba4e7345ce28afe97c87a3fc447d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de8ba4e7345ce28afe97c87a3fc447d")).intValue() : a(getItem(i));
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final com.sankuai.xm.imui.session.entity.b getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b61550ce2638da4d5c8e6a3731132f", 6917529027641081856L) ? (com.sankuai.xm.imui.session.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b61550ce2638da4d5c8e6a3731132f") : this.f.get(i);
    }

    private com.sankuai.xm.imui.session.entity.b a(BaseCommonView baseCommonView, com.sankuai.xm.imui.session.entity.b bVar, int i) {
        Object[] objArr = {baseCommonView, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8dff9ae948b3e51315f04bf135fa82e", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.session.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8dff9ae948b3e51315f04bf135fa82e");
        }
        if (!(baseCommonView instanceof UnknownMsgView) || (bVar.b instanceof UNKnownMessage)) {
            return bVar;
        }
        UNKnownMessage uNKnownMessage = new UNKnownMessage();
        uNKnownMessage.copyFrom(bVar.b);
        com.sankuai.xm.imui.session.entity.b a2 = this.c.a(uNKnownMessage);
        this.f.set(i, a2);
        notifyDataSetChanged();
        return a2;
    }

    private int a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac1a799bfaa673ca26476dd327056fa5", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac1a799bfaa673ca26476dd327056fa5")).intValue();
        }
        int a2 = MsgViewType.a(bVar.b);
        if (a2 == 16) {
            if (this.i != null) {
                int i = this.g.size() > 1 ? this.g.get(this.i.getViewType((GeneralMessage) bVar.b), -1) : 0;
                if (i >= 0) {
                    int size = (this.h.size() + i) * 3;
                    switch (bVar.g) {
                        case 2:
                            return size + 1;
                        case 3:
                            return size + 2;
                        default:
                            return size;
                    }
                }
            }
            a2 = 18;
        }
        int i2 = this.h.get(a2) * 3;
        switch (bVar.g) {
            case 2:
                return i2 + 1;
            case 3:
                return i2 + 2;
            default:
                return i2;
        }
    }
}
