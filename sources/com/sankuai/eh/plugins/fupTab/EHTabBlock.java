package com.sankuai.eh.plugins.fupTab;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHTabBlock extends LinearLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private List<BlockItemView> c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(BlockItemView blockItemView, int i);
    }

    public EHTabBlock(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a65fc65677118ef1969cd5702388f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a65fc65677118ef1969cd5702388f3");
            return;
        }
        this.b = 0;
        a();
    }

    public EHTabBlock(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63206b23000a82e9a77da395d7f1a166", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63206b23000a82e9a77da395d7f1a166");
            return;
        }
        this.b = 0;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d243265f313c88fb78cc9a74ed5b14c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d243265f313c88fb78cc9a74ed5b14c");
            return;
        }
        setId(R.id.ehc_tab_main);
        this.c = new ArrayList();
    }

    public final void a(com.sankuai.eh.plugins.fupTab.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5b460faf3651d7671441e6e9583f29a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5b460faf3651d7671441e6e9583f29a");
            return;
        }
        BlockItemView blockItemView = new BlockItemView(getContext(), aVar);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        blockItemView.setGravity(17);
        addView(blockItemView, layoutParams);
        this.c.add(blockItemView);
        blockItemView.setPressedState(aVar.h);
        blockItemView.setOnClickListener(b.a(this, blockItemView));
    }

    public static /* synthetic */ void a(EHTabBlock eHTabBlock, BlockItemView blockItemView, View view) {
        Object[] objArr = {eHTabBlock, blockItemView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cd9bae87bc45002c0deca7e75e27594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cd9bae87bc45002c0deca7e75e27594");
        } else if (eHTabBlock.d != null) {
            eHTabBlock.d.a(blockItemView, eHTabBlock.c.indexOf(blockItemView));
        }
    }

    public void setOnItemClickListener(a aVar) {
        this.d = aVar;
    }

    public a getItemClickListener() {
        return this.d;
    }

    public int getCurIndex() {
        return this.b;
    }

    public com.sankuai.eh.plugins.fupTab.a getCurItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d53c01846c9ea32a86348852018d0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.eh.plugins.fupTab.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d53c01846c9ea32a86348852018d0b");
        }
        if (this.c.get(this.b) != null) {
            return this.c.get(this.b).getBlockItem();
        }
        return null;
    }

    public List<com.sankuai.eh.plugins.fupTab.a> getAllItems() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07734720f5e76e61431cc1b1af421e1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07734720f5e76e61431cc1b1af421e1d");
        }
        ArrayList arrayList = new ArrayList();
        for (BlockItemView blockItemView : this.c) {
            arrayList.add(blockItemView.getBlockItem());
        }
        return arrayList;
    }

    public void setCurIndex(int i) {
        this.b = i;
    }

    public void setItemPressed(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e283f60279d7b1200555606d3e0c1ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e283f60279d7b1200555606d3e0c1ae");
        } else if (this.c.size() > i) {
            this.c.get(this.b).setPressedState(false);
            this.c.get(i).setPressedState(true);
            this.b = i;
        }
    }
}
