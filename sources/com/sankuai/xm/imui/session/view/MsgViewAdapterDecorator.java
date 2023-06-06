package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.session.view.adapter.IAudioMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.ICalendarMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.ICallMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IEmotionMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IEventMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter;
import com.sankuai.xm.imui.session.view.adapter.IFileMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IGeneralMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IImageMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.ILinkMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.ILocationMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.ILongTextMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMultiLinkMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.INoticeMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IPubLinkMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IPubMultiLinkMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.ITemplateMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.ITextMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IUnknownMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IVCardMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.IVideoMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter;
import com.sankuai.xm.ui.service.b;
import com.sankuai.xm.ui.service.internal.impl.c;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MsgViewAdapterDecorator implements IMsgViewAdapter {
    public static ChangeQuickRedirect a;
    private static Method[] d = IMsgAdapter.class.getDeclaredMethods();
    private static SparseArray<Class<? extends IExtraAdapter>> e = new SparseArray<>();
    public ICommonAdapter b;
    public SparseArray<IExtraAdapter> c;
    private Context f;
    private final IMsgViewAdapter g;
    private final IMsgViewAdapter h;
    private ICommonAdapter i;

    static {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a2813fc9d6f1d27027b4ba9bf2cfa38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a2813fc9d6f1d27027b4ba9bf2cfa38");
            return;
        }
        e.put(0, ITextMsgAdapter.class);
        e.put(4, ICalendarMsgAdapter.class);
        e.put(11, IEventMsgAdapter.class);
        e.put(18, IUnknownMsgAdapter.class);
        e.put(7, IFileMsgAdapter.class);
        e.put(19, ILongTextMsgAdapter.class);
        e.put(1, IAudioMsgAdapter.class);
        e.put(16, IGeneralMsgAdapter.class);
        e.put(8, ILocationMsgAdapter.class);
        e.put(10, IEmotionMsgAdapter.class);
        e.put(12, ITemplateMsgAdapter.class);
        e.put(5, ILinkMsgAdapter.class);
        e.put(20, IPubLinkMsgAdapter.class);
        e.put(6, IMultiLinkMsgAdapter.class);
        e.put(21, IPubMultiLinkMsgAdapter.class);
        e.put(13, INoticeMsgAdapter.class);
        e.put(2, IVideoMsgAdapter.class);
        e.put(14, ICallMsgAdapter.class);
        e.put(9, IVCardMsgAdapter.class);
        e.put(3, IImageMsgAdapter.class);
        e.put(22, IExtraViewAdapter.class);
    }

    public MsgViewAdapterDecorator(Context context, IMsgViewAdapter iMsgViewAdapter) {
        Object[] objArr = {context, iMsgViewAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5107b835729d0ac6381cd8008ba953b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5107b835729d0ac6381cd8008ba953b0");
            return;
        }
        this.c = new SparseArray<>();
        this.f = context;
        this.g = iMsgViewAdapter;
        this.h = new MsgViewAdapter();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public ICommonAdapter getCommonAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455c54160075050e1746a123cacd4432", 6917529027641081856L)) {
            return (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455c54160075050e1746a123cacd4432");
        }
        if (this.b == null) {
            this.b = (ICommonAdapter) c.b.a.a(ICommonAdapter.class, this.g != null ? this.g.getCommonAdapter() : null, a(), d);
            this.b.init(this.f);
        }
        return this.b;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public IExtraAdapter getExtraAdapter(int i) {
        IExtraViewAdapter b;
        b bVar;
        boolean z;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401ea47a1a46771c938c119ac81c5bca", 6917529027641081856L)) {
            return (IExtraAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401ea47a1a46771c938c119ac81c5bca");
        }
        IExtraAdapter iExtraAdapter = this.c.get(i);
        if (iExtraAdapter == null) {
            IExtraAdapter extraAdapter = this.h.getExtraAdapter(i);
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83186431c2c83c94061304b8480492d1", 6917529027641081856L)) {
                b = (IExtraViewAdapter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83186431c2c83c94061304b8480492d1");
            } else {
                b = (i != 22 || (bVar = (b) m.a(b.class)) == null) ? null : bVar.b();
            }
            if (b == null && this.g != null) {
                b = this.g.getExtraAdapter(i);
            }
            IExtraAdapter iExtraAdapter2 = b;
            Object[] objArr3 = {iExtraAdapter2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e886d97e68bd2e297a5669dcb95da33d", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e886d97e68bd2e297a5669dcb95da33d")).booleanValue();
            } else {
                if (iExtraAdapter2 != null) {
                    Class<? extends IExtraAdapter> cls = e.get(i);
                    if (cls == null) {
                        d.d("view type [" + i + "] is not supported.", new Object[0]);
                    } else if (!cls.isInstance(iExtraAdapter2)) {
                        d.d("the adapter for view type [" + i + "] MUST be a instance of " + cls.getName(), new Object[0]);
                    }
                    z = false;
                }
                z = true;
            }
            IExtraAdapter iExtraAdapter3 = z ? iExtraAdapter2 : null;
            if (iExtraAdapter3 != null && extraAdapter != null) {
                iExtraAdapter3 = (IExtraAdapter) c.b.a.a(e.get(i), iExtraAdapter3, extraAdapter, d);
            }
            iExtraAdapter = iExtraAdapter3 == null ? extraAdapter : iExtraAdapter3;
            if (iExtraAdapter != null) {
                iExtraAdapter.init(this.f);
                this.c.put(i, iExtraAdapter);
            }
        }
        return iExtraAdapter;
    }

    public final ICommonAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c805490fea0bafcf693f78f0d405742a", 6917529027641081856L)) {
            return (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c805490fea0bafcf693f78f0d405742a");
        }
        if (this.i == null) {
            this.i = this.h.getCommonAdapter();
        }
        return this.i;
    }
}
