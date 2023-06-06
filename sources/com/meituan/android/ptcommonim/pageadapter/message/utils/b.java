package com.meituan.android.ptcommonim.pageadapter.message.utils;

import android.content.Context;
import com.meituan.android.ptcommonim.pageadapter.message.item.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.session.event.e;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.sankuai.xm.base.callback.c<e.a> {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final g c;
    private final Set<String> d;
    private final Set<String> e;
    private final Set<String> f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.xm.base.callback.c
    public final /* synthetic */ boolean a(e.a aVar) {
        e.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc82b098a362c16d2341f9d2b8759e22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc82b098a362c16d2341f9d2b8759e22")).booleanValue();
        }
        if ((aVar2 instanceof e.a) && a2(aVar2)) {
            if (aVar2.a()) {
                EventMessage a2 = aVar2.b() != null ? aVar2.b().a() : null;
                if (a2 instanceof GeneralMessage) {
                    String msgUuid = ((GeneralMessage) aVar2.b().a()).getMsgUuid();
                    this.d.add(msgUuid);
                    b(msgUuid, this.c.a().get(msgUuid));
                } else if ((a2 instanceof EventMessage) && !this.f.contains(a2.getMsgUuid())) {
                    this.f.add(a2.getMsgUuid());
                    if (this.c != null) {
                        this.c.a(a2);
                    }
                }
            } else if (aVar2.b().a() instanceof GeneralMessage) {
                String msgUuid2 = ((GeneralMessage) aVar2.b().a()).getMsgUuid();
                com.meituan.android.ptcommonim.pageadapter.message.item.a aVar3 = this.c.a().get(msgUuid2);
                Object[] objArr2 = {msgUuid2, aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9203ce26540917f23ed755ad9924497c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9203ce26540917f23ed755ad9924497c");
                } else {
                    a.b(aVar3);
                }
            }
        }
        return false;
    }

    public b(Context context, g gVar) {
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972050fd03ff1b2ff351403fb02cf341", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972050fd03ff1b2ff351403fb02cf341");
            return;
        }
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashSet();
        this.b = context;
        this.c = gVar;
    }

    private void b(String str, com.meituan.android.ptcommonim.pageadapter.message.item.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "071991eed375a5cd77c50216644d2dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "071991eed375a5cd77c50216644d2dff");
        } else if (!this.d.contains(str) || !this.e.contains(str) || aVar.f || aVar.i) {
        } else {
            a.a(aVar);
        }
    }

    public final void a(String str, com.meituan.android.ptcommonim.pageadapter.message.item.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbde9a343cbaf19955dc86a08b473f5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbde9a343cbaf19955dc86a08b473f5b");
            return;
        }
        this.e.add(str);
        b(str, aVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.sankuai.xm.im.message.bean.IMMessage] */
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private boolean a2(e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dec52503d99c07433888faddae226464", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dec52503d99c07433888faddae226464")).booleanValue();
        }
        try {
            if (this.c == null || !this.c.a().containsKey(aVar.b().a().getMsgUuid())) {
                if (!(aVar.b().a() instanceof EventMessage)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
