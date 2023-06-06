package com.meituan.android.cashier.oneclick.recce.view.draglist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.android.cashier.oneclick.recce.view.draglist.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DragList<T extends c> extends RecyclerView {
    public static ChangeQuickRedirect a;
    private e<T> b;
    private Context c;
    private com.meituan.android.cashier.oneclick.recce.view.draglist.event.a d;

    @Override // android.view.View, android.view.ViewParent
    public boolean isLayoutRequested() {
        return false;
    }

    public DragList(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d513662bac2eecd472a806f668abd950", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d513662bac2eecd472a806f668abd950");
        } else {
            a(context);
        }
    }

    public DragList(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8c23b4491335308347ecd243475ed1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8c23b4491335308347ecd243475ed1");
        } else {
            a(context);
        }
    }

    private void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b18c8694b42f94b5da770c2b1ec1e55e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b18c8694b42f94b5da770c2b1ec1e55e");
            return;
        }
        this.c = context;
        this.b = new e<>(context);
        if (this.d != null) {
            this.b.c = this.d;
        }
        setHasFixedSize(true);
        int a2 = com.meituan.android.recce.utils.d.a(context, 5.0f);
        int a3 = com.meituan.android.recce.utils.d.a(context, 10.0f);
        addItemDecoration(new f(a2, a2, a3, a3));
        setLayoutManager(new LinearLayoutManager(context));
    }

    public void setData(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25820467c6ad82c2aa0c318192e8d205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25820467c6ad82c2aa0c318192e8d205");
            return;
        }
        this.b.b = list;
        setAdapter(this.b);
        new android.support.v7.widget.helper.a(new com.meituan.android.cashier.oneclick.recce.view.draglist.helper.c(this.b)).a((RecyclerView) this);
    }

    public void setOnDragFinishCallback(com.meituan.android.cashier.oneclick.recce.view.draglist.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d372402766cf568c7ee686d6e76a1bb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d372402766cf568c7ee686d6e76a1bb6");
        } else if (this.b == null) {
            this.d = aVar;
        } else {
            this.b.c = aVar;
        }
    }

    public void setItemBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d5a4a6cdebd038b7385c7b09cff60c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d5a4a6cdebd038b7385c7b09cff60c");
        } else if (this.b != null) {
            this.b.d = i;
        }
    }

    public void setItemStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50859f364e1c28e2d41287e59dfd039d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50859f364e1c28e2d41287e59dfd039d");
        } else if (this.b != null) {
            e<T> eVar = this.b;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "8066c0f1ac64b9ad5dd4a7dd4a7e9493", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "8066c0f1ac64b9ad5dd4a7dd4a7e9493");
                return;
            }
            eVar.e = z;
            eVar.notifyItemRangeChanged(0, eVar.getItemCount());
        }
    }
}
