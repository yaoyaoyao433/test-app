package com.sankuai.waimai.store.drug.search.ui.block.sortfilter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchFilterFragment;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    boolean b;
    public SearchShareData c;
    SGSearchFilterFragment d;
    com.sankuai.waimai.store.search.statistics.f e;
    private TextView f;
    private ImageView g;

    public static /* synthetic */ void a(a aVar, Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "caeff2791ac41e6d4d53da40a8d7e456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "caeff2791ac41e6d4d53da40a8d7e456");
        } else if (aVar.mContext instanceof FragmentActivity) {
            ((FragmentActivity) aVar.mContext).getSupportFragmentManager().beginTransaction().replace(R.id.sort_filter_mask_container, fragment).commitAllowingStateLoss();
        }
    }

    public a(@NonNull Context context, SearchShareData searchShareData, com.sankuai.waimai.store.search.statistics.f fVar) {
        super(context);
        Object[] objArr = {context, searchShareData, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7186fea779beab7e2ef821a3a84178d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7186fea779beab7e2ef821a3a84178d");
            return;
        }
        this.b = false;
        this.c = searchShareData;
        this.e = fVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb14a51e334e00512e81deee997c2edb", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb14a51e334e00512e81deee997c2edb") : layoutInflater.inflate(R.layout.wm_drug_search_all_filter_btn, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc940f456783e1efbbd051ce2806d819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc940f456783e1efbbd051ce2806d819");
            return;
        }
        this.f = (TextView) findView(R.id.all_filter_text);
        this.g = (ImageView) findView(R.id.all_filter_icon);
        a(0);
        this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.search.ui.block.sortfilter.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a9b1ab9198347e694d18fd51985e355", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a9b1ab9198347e694d18fd51985e355");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(a.this.mContext, "b_FLgH0").b(a.this.a(a.this.mContext.getResources().getString(R.string.wm_sc_nox_search_filter), 0)).a();
                if (a.this.b) {
                    if (a.this.d != null) {
                        a.this.d.u();
                        return;
                    }
                    return;
                }
                if (a.this.d == null) {
                    a.this.d = new SGSearchFilterFragment();
                    a.this.d.c = new SGSearchFilterFragment.a() { // from class: com.sankuai.waimai.store.drug.search.ui.block.sortfilter.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchFilterFragment.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aaa8f10a556ec78fb867ce48a1bb516b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aaa8f10a556ec78fb867ce48a1bb516b");
                                return;
                            }
                            SearchShareData searchShareData = a.this.c;
                            f.b bVar = new f.b(7);
                            bVar.h = true;
                            searchShareData.a(bVar);
                        }

                        @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.a
                        public final void b() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7dcef0e208e3268f51699845867ec9b6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7dcef0e208e3268f51699845867ec9b6");
                                return;
                            }
                            a.this.b = true;
                            a.this.a(a.this.c.j());
                        }

                        @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.a
                        public final void c() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0e4bde9a6e21a66bbbd394dbd9877029", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0e4bde9a6e21a66bbbd394dbd9877029");
                                return;
                            }
                            a.this.b = false;
                            a.this.a(a.this.c.j());
                        }
                    };
                }
                a.this.d.a(a.this.e, a.this.c.q);
                a.a(a.this, a.this.d);
            }
        });
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3145976c9048ba3debb6c416f41bc8c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3145976c9048ba3debb6c416f41bc8c9");
        } else if (z) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.mContext, "b_KnLVX").b(a(this.mContext.getResources().getString(R.string.wm_sc_nox_search_filter), 0)).a();
        }
    }

    Map<String, Object> a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc80d1e137308a98222ec40285db6f01", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc80d1e137308a98222ec40285db6f01");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", Integer.valueOf(this.c.z));
        hashMap.put("keyword", this.c.h);
        hashMap.put("template_type", Integer.valueOf(this.c.D));
        hashMap.put("search_log_id", this.c.q);
        hashMap.put("stid", com.sankuai.waimai.store.search.statistics.g.f(this.c));
        hashMap.put("tab_code", this.c.am);
        hashMap.put("type", str);
        hashMap.put("show_type", Integer.valueOf(i));
        return hashMap;
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2862bb08fe0b8cede2fb5f4ee5377f50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2862bb08fe0b8cede2fb5f4ee5377f50");
        } else if (i > 0) {
            this.f.setTextColor(this.mContext.getResources().getColor(R.color.wm_sc_nox_search_color_FF8000));
            this.f.setTypeface(Typeface.defaultFromStyle(1));
            this.g.setImageDrawable(this.mContext.getResources().getDrawable(R.drawable.wm_drug_all_filter_icon_selected));
        } else {
            this.f.setTextColor(this.mContext.getResources().getColor(R.color.wm_sc_nox_search_color_575859));
            this.f.setTypeface(Typeface.defaultFromStyle(0));
            this.g.setImageDrawable(this.mContext.getResources().getDrawable(R.drawable.wm_drug_all_filter_icon_unselect));
        }
    }
}
