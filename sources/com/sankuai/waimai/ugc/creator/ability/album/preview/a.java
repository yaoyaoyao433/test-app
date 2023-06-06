package com.sankuai.waimai.ugc.creator.ability.album.preview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock;
import com.sankuai.waimai.ugc.creator.component.d;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.framework.b;
import com.sankuai.waimai.ugc.creator.handler.c;
import com.sankuai.waimai.ugc.creator.handler.e;
import com.sankuai.waimai.ugc.creator.manager.i;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b implements c {
    public static ChangeQuickRedirect a;
    private FlowLineActionBarBlock b;
    private d c;
    private ViewPager d;
    private View e;
    private TextView f;
    private MediaPreviewPagerAdapter g;
    private List<ImageData> h;
    private SparseIntArray i;
    private int j;
    private int k;
    private int l;

    public a(Fragment fragment) {
        super(fragment);
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b634f34d52cd71bdd146662346e08459", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b634f34d52cd71bdd146662346e08459");
            return;
        }
        this.j = 0;
        this.k = 0;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eba453de84fb2569753100611762ca4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eba453de84fb2569753100611762ca4c");
            return;
        }
        super.a(bundle);
        this.h = new ArrayList();
        e eVar = (e) a(e.class);
        this.h = eVar.f();
        this.i = eVar.h();
        Bundle arguments = this.v.getArguments();
        this.j = this.i.keyAt(this.i.indexOfValue(arguments != null ? arguments.getInt("first_media_index", 0) : 0));
        this.l = i.a().c().j;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d0ac9f691e6a75ae8a1b385fb8244e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d0ac9f691e6a75ae8a1b385fb8244e") : layoutInflater.inflate(R.layout.wm_ugc_media_album_preview_fragment, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3f2ab01d9d369f2116524a29093f0b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3f2ab01d9d369f2116524a29093f0b7");
            return;
        }
        super.a(view);
        this.b = new FlowLineActionBarBlock(1);
        a(R.id.fl_media_preview_actionbar_container, (int) this.b);
        this.b.a(((e) a(e.class)).e(), this.l);
        this.f = (TextView) view.findViewById(R.id.tv_selected);
        this.e = view.findViewById(R.id.v_selected);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.album.preview.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1307f5b95990921133058a31e97623b3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1307f5b95990921133058a31e97623b3");
                } else {
                    ((e) a.this.a(e.class)).b((ImageData) a.this.h.get(a.this.k));
                }
            }
        });
        int a2 = g.a(A(), 60.0f);
        this.c = new d(false, a2, a2);
        a(R.id.bottom_layout, (int) this.c);
        this.c.a(new com.sankuai.waimai.ugc.creator.ability.imgedit.ex.d() { // from class: com.sankuai.waimai.ugc.creator.ability.album.preview.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.ability.imgedit.ex.d
            public final void a(ImageData imageData, int i) {
                Object[] objArr2 = {imageData, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ee253d30e86d569ac5eee56ad2a4ee3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ee253d30e86d569ac5eee56ad2a4ee3");
                    return;
                }
                int indexOf = a.this.h.indexOf(imageData);
                if (indexOf >= 0) {
                    a.this.k = indexOf;
                    a.this.d.setCurrentItem(a.this.k, false);
                    a.this.e();
                }
            }
        });
        List<ImageData> g = ((e) a(e.class)).g();
        this.c.a(g);
        this.c.c(g.size() > 0 ? 0 : 8);
        this.d = (ViewPager) view.findViewById(R.id.vp_photos);
        this.d.setOffscreenPageLimit(1);
        this.d.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.sankuai.waimai.ugc.creator.ability.album.preview.MediaPreviewFragmentBlock$3
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c21bcd9a590f389d0edcac14fedd00e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c21bcd9a590f389d0edcac14fedd00e6");
                    return;
                }
                super.onPageSelected(i);
                a.this.k = i;
                a.this.d();
                a.this.e();
            }
        });
        this.g = new MediaPreviewPagerAdapter(D(), this.h);
        this.d.setAdapter(this.g);
        this.d.setCurrentItem(this.j, false);
    }

    private int a(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181201753e86e06ed60d8740f5486fdd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181201753e86e06ed60d8740f5486fdd")).intValue() : ((e) a(e.class)).a(imageData);
    }

    @Override // com.sankuai.waimai.ugc.creator.handler.c
    public final void a(List<ImageData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b8bd501d7e80fd8e5f416872e88447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b8bd501d7e80fd8e5f416872e88447");
            return;
        }
        this.b.a(list.size(), this.l);
        this.c.a(list);
        this.c.c(list.size() <= 0 ? 8 : 0);
        d();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d41ea8f65aa6c47f968347afcd10e6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d41ea8f65aa6c47f968347afcd10e6e");
            return;
        }
        this.c.a(this.h.get(this.k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9934591571e78114108b6deba217ddc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9934591571e78114108b6deba217ddc1");
            return;
        }
        int a2 = a(this.h.get(this.k));
        boolean z = a2 >= 0;
        this.e.setSelected(z);
        this.f.setVisibility(z ? 0 : 4);
        this.f.setText(String.valueOf(a2 + 1));
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "139bf4c6f1aa00d4282b28a22ad40b2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "139bf4c6f1aa00d4282b28a22ad40b2e");
            return;
        }
        super.b();
        this.h = null;
        if (this.d != null) {
            this.d.setAdapter(null);
        }
    }
}
