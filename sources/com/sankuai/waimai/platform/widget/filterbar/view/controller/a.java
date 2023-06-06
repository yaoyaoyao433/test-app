package com.sankuai.waimai.platform.widget.filterbar.view.controller;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.f;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.CategoryBean;
import com.sankuai.waimai.platform.widget.filterbar.presenter.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements a.c {
    public static ChangeQuickRedirect f;
    private int a;
    public long g;
    public long h;
    public int i;
    public String j;

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void a(int i) {
    }

    public void a(b bVar, Set<String> set) {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void a(ArrayList<CategoryBean.Category> arrayList, f fVar) {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void a(List<b.a.C1086a> list, Set<String> set) {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void b(int i) {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void b(b bVar, Set<String> set, Map<String, g> map) {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void b(Object obj) {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void d() {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void e() {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void e(boolean z) {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void f(boolean z) {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void g() {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void g(boolean z) {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void h() {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void h(boolean z) {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public void i(boolean z) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aec46b97dcfd1158d4df333bc582b4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aec46b97dcfd1158d4df333bc582b4c");
            return;
        }
        this.g = 0L;
        this.h = 0L;
        this.i = 0;
        this.j = "";
        this.a = 0;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f92689a6b56d2a85add816699059fd38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f92689a6b56d2a85add816699059fd38");
            return;
        }
        this.g = j;
        this.h = j2;
        this.i = i;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(String str) {
        this.j = str;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final int l() {
        return this.a;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void c(int i) {
        this.a = i;
    }
}
