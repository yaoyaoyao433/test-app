package com.meituan.android.cashier.oneclick.recce.view.draglist;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewGroupManager;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cashier.oneclick.recce.view.draglist.a;
import com.meituan.android.cashier.oneclick.recce.view.draglist.model.PayModeListItemData;
import com.meituan.android.recce.views.base.RecceUIManagerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d<T extends a<PayModeListItemData>, V extends ViewGroupManager<T>> extends com.meituan.android.recce.mrn.uimanager.c<T, V> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitCustomEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fb6929f3a7c7d14e731ff2666b05254", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fb6929f3a7c7d14e731ff2666b05254");
        }
        if ("dragFinish".equals(str)) {
            com.dianping.networklog.c.a("RecceDragListPropsVisitor: dragFinish", 3, new String[]{"Recce-Android"});
            ((a) this.view).setOnDragFinishCallback(new com.meituan.android.cashier.oneclick.recce.view.draglist.event.a() { // from class: com.meituan.android.cashier.oneclick.recce.view.draglist.d.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cashier.oneclick.recce.view.draglist.event.a
                public final void a(final String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea67a06ebab5110f36860c38f853a551", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea67a06ebab5110f36860c38f853a551");
                        return;
                    }
                    com.dianping.networklog.c.a("RecceDragListPropsVisitor: onDragFinishCallback", 3, new String[]{"Recce-Android"});
                    com.meituan.android.recce.events.d recceEventDispatcher = RecceUIManagerUtils.getRecceEventDispatcher(d.this.view);
                    int id = ((a) d.this.view).getId();
                    Object[] objArr3 = {Integer.valueOf(id), "dragFinish", str2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.recce.events.f.b;
                    recceEventDispatcher.a((com.meituan.android.recce.events.f) (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1f3e3068776e9145c9a0122dd3d19d1e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.recce.events.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1f3e3068776e9145c9a0122dd3d19d1e") : new com.meituan.android.recce.events.b(id) { // from class: com.meituan.android.recce.events.f.2
                        @Override // com.meituan.android.recce.events.c
                        public final String b() {
                            return r2;
                        }

                        @Override // com.meituan.android.recce.events.b
                        public final String d() {
                            return str2;
                        }
                    }));
                }
            });
            return null;
        }
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88cb24fec0f5d7ce8b24a4986f12700", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88cb24fec0f5d7ce8b24a4986f12700");
        }
        ((a) this.view).setDragListEnabled(z);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitItemBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9a358ef4ab24522cc558fdda7a2969", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9a358ef4ab24522cc558fdda7a2969");
        }
        ((a) this.view).setItemBackgroundColor(i);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitSelfAttribute(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d0bd5216b1caa2093dd6f6162c6d0f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d0bd5216b1caa2093dd6f6162c6d0f6");
        }
        new StringBuilder("visitSelfAttribute: ").append(str);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitSelfCommon(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7256a973eb668f283ad8ad26ace11b01", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7256a973eb668f283ad8ad26ace11b01");
        }
        new StringBuilder("visitSelfCommon: ").append(str);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitSelfCustom(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b994593659fa807d138e5ed21f85e49", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b994593659fa807d138e5ed21f85e49");
        }
        new StringBuilder("visitSelfCustom: ").append(str);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitSelfData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4942436d700bfad00ad343b5df5ffb8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4942436d700bfad00ad343b5df5ffb8b");
        }
        new StringBuilder("visitSelfData: ").append(str);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitSelfDefine(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aa17a6e6b34d234fafb170b70949a4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aa17a6e6b34d234fafb170b70949a4e");
        }
        new StringBuilder("visitSelfDefine: ").append(str);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitSelfPreset(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae08c517ff2dcbf6a7715b23fd7922d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae08c517ff2dcbf6a7715b23fd7922d2");
        }
        new StringBuilder("visitSelfPreset: ").append(str);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitSelfProperty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbe32d4c9b4ea60ea3d0c049a3d9c51f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbe32d4c9b4ea60ea3d0c049a3d9c51f");
        }
        new StringBuilder("visitSelfProperty: ").append(str);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitSelfStyle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b43ef6d7fb10ac9ebda0bf405bb69d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b43ef6d7fb10ac9ebda0bf405bb69d3");
        }
        new StringBuilder("visitSelfStyle: ").append(str);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitSelfUsual(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390685468be911914001fead4b672f5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390685468be911914001fead4b672f5e");
        }
        new StringBuilder("visitSelfUsual: ").append(str);
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public final /* synthetic */ Object visitSelfValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95cc5a367ae1b93939f19688abfec57f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95cc5a367ae1b93939f19688abfec57f");
        }
        new StringBuilder("visitSelfValue: ").append(str);
        return null;
    }

    public d(T t, V v) {
        super(t, v);
        Object[] objArr = {t, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e611140fe133a47d8e921564b675d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e611140fe133a47d8e921564b675d0");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    /* renamed from: a */
    public Void visitData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff852fa139ba75a7be892016c53eb8dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff852fa139ba75a7be892016c53eb8dd");
        }
        new StringBuilder("visitData: ").append(str);
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            ((a) this.view).setData((List) com.meituan.android.recce.utils.b.a().fromJson(str, new TypeToken<List<PayModeListItemData>>() { // from class: com.meituan.android.cashier.oneclick.recce.view.draglist.d.1
            }.getType()));
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
