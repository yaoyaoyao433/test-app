package com.sankuai.waimai.business.ugc.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.R;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.ugc.creator.ability.album.AlbumFragment;
import com.sankuai.waimai.ugc.creator.ability.camera.PhotoCameraFragment;
import com.sankuai.waimai.ugc.creator.ability.camera.VideoCameraFragment;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.framework.BaseFragment;
import com.sankuai.waimai.ugc.creator.handler.c;
import com.sankuai.waimai.ugc.creator.judas.e;
import com.sankuai.waimai.ugc.creator.manager.i;
import com.sankuai.waimai.ugc.creator.utils.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.ugc.creator.base.b implements c {
    public static ChangeQuickRedirect a;
    private int[] b;
    private final List<com.sankuai.waimai.ugc.creator.entity.inner.b> c;
    private TabLayout d;
    private TabLayout.a e;
    private FragmentManager f;
    private AlbumFragment g;
    private PhotoCameraFragment h;
    private VideoCameraFragment i;
    private BaseFragment j;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fd707717129006f7c1dba85737e5c5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fd707717129006f7c1dba85737e5c5f");
            return;
        }
        this.b = new int[]{1, 2, 3};
        this.c = new ArrayList();
    }

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f77f9b03d8e895b867337923267f1e2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f77f9b03d8e895b867337923267f1e2b");
            return;
        }
        com.sankuai.waimai.ugc.creator.entity.inner.b bVar = aVar.c.get(i);
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        BaseFragment baseFragment = null;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ad05a764b40aad895fb417e497761818", RobustBitConfig.DEFAULT_VALUE)) {
            baseFragment = (BaseFragment) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ad05a764b40aad895fb417e497761818");
        } else if (bVar != null) {
            if (bVar.a == 1) {
                if (aVar.g == null) {
                    aVar.g = AlbumFragment.a();
                }
                baseFragment = aVar.g;
            } else if (bVar.a == 2) {
                if (aVar.i == null) {
                    aVar.i = VideoCameraFragment.a();
                }
                baseFragment = aVar.i;
            } else if (bVar.a == 3) {
                if (aVar.h == null) {
                    aVar.h = PhotoCameraFragment.a();
                }
                baseFragment = aVar.h;
            }
        }
        if (baseFragment != null) {
            if (aVar.f == null) {
                aVar.f = aVar.C();
            }
            FragmentTransaction beginTransaction = aVar.f.beginTransaction();
            if (aVar.j instanceof AlbumFragment) {
                beginTransaction.hide(aVar.j);
            } else if (aVar.j != null) {
                beginTransaction.remove(aVar.j);
            }
            if ((baseFragment instanceof AlbumFragment) && baseFragment.isAdded()) {
                beginTransaction.show(baseFragment);
            } else {
                beginTransaction.add(R.id.ability_fragment_container, baseFragment);
            }
            beginTransaction.commit();
            aVar.f.executePendingTransactions();
            aVar.j = baseFragment;
        }
    }

    public static /* synthetic */ void a(a aVar, TabLayout.d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "04e2496d865ff5d6aabd3907cb1b5f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "04e2496d865ff5d6aabd3907cb1b5f14");
            return;
        }
        View view = dVar.f;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_title);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_tab_indicator);
            if (z) {
                textView.setTextColor(Color.parseColor("#FFFFFF"));
                textView.setTextSize(2, 16.0f);
                textView.getPaint().setFakeBoldText(true);
                imageView.setVisibility(0);
                return;
            }
            textView.setTextColor(Color.parseColor("#80FFFFFF"));
            textView.setTextSize(2, 14.0f);
            textView.getPaint().setFakeBoldText(false);
            imageView.setVisibility(4);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final void a(Intent intent) {
        String str;
        int i = 1;
        char c = 0;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5877dee3704c8f6ba8ae7abd0511765f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5877dee3704c8f6ba8ae7abd0511765f");
            return;
        }
        int i2 = this.o.b;
        int i3 = this.o.c;
        if (s()) {
            i2 = j.a(w(), "mediaType", i2);
            i3 = j.a(w(), "sourceType", i3);
        }
        if (i3 == 0) {
            if (i2 == 0) {
                this.b = new int[]{1, 2, 3};
            } else if (i2 == 1) {
                this.b = new int[]{1, 3};
            } else if (i2 == 2) {
                this.b = new int[]{1, 2};
            }
        } else if (i3 == 1) {
            this.b = new int[]{1};
        } else if (i3 == 2) {
            if (i2 == 0) {
                this.b = new int[]{2, 3};
            } else if (i2 == 1) {
                this.b = new int[]{3};
            } else if (i2 == 2) {
                this.b = new int[]{2};
            }
        }
        this.c.clear();
        int[] iArr = this.b;
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            com.sankuai.waimai.ugc.creator.entity.inner.b bVar = new com.sankuai.waimai.ugc.creator.entity.inner.b();
            bVar.a = i5;
            Object[] objArr2 = new Object[i];
            objArr2[c] = Integer.valueOf(i5);
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "113f1fcc615af33f1d585d66482899c2", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "113f1fcc615af33f1d585d66482899c2");
            } else {
                switch (i5) {
                    case 1:
                        str = "相册";
                        continue;
                    case 2:
                        str = "拍视频";
                        continue;
                    case 3:
                        str = "拍照";
                        continue;
                    default:
                        str = "";
                        continue;
                }
            }
            bVar.b = str;
            this.c.add(bVar);
            i4++;
            i = 1;
            c = 0;
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc2920739e8dd7d80700ddfd1abfd6a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc2920739e8dd7d80700ddfd1abfd6a") : layoutInflater.inflate(R.layout.wm_ugc_media_activity_new, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(View view) {
        int a2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb1d24e35e3950d30419b949f87a1c9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb1d24e35e3950d30419b949f87a1c9b");
            return;
        }
        super.a(view);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4734cdc515a9399a9528680ed22a456c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4734cdc515a9399a9528680ed22a456c");
            return;
        }
        this.d = (TabLayout) b(R.id.bottom_tab);
        this.e = new TabLayout.a() { // from class: com.sankuai.waimai.business.ugc.media.a.1
            public static ChangeQuickRedirect a;

            @Override // android.support.design.widget.TabLayout.a
            public final void c(TabLayout.d dVar) {
            }

            @Override // android.support.design.widget.TabLayout.a
            public final void b(TabLayout.d dVar) {
                Object[] objArr3 = {dVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4b1109701996a2e33328db6f03e985b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4b1109701996a2e33328db6f03e985b");
                } else {
                    a.a(a.this, dVar, false);
                }
            }

            @Override // android.support.design.widget.TabLayout.a
            public final void a(TabLayout.d dVar) {
                Object[] objArr3 = {dVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eb765bcb5f06f3a6469ea6354dd1e792", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eb765bcb5f06f3a6469ea6354dd1e792");
                    return;
                }
                int i = dVar.e;
                a.a(a.this, dVar, true);
                a.a(a.this, i);
                if (a.this.b[i] != 3) {
                    if (a.this.b[i] == 2) {
                        e a3 = e.a();
                        Activity B = a.this.B();
                        Object[] objArr4 = {B};
                        ChangeQuickRedirect changeQuickRedirect4 = e.a;
                        if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "bccead65d317a4aa61ade1d8174513ae", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "bccead65d317a4aa61ade1d8174513ae");
                            return;
                        } else if (a3.b != null) {
                            a3.a(a3.b.k, a3.b.a, (Map<String, Object>) null, B);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                e a4 = e.a();
                Activity B2 = a.this.B();
                Object[] objArr5 = {B2};
                ChangeQuickRedirect changeQuickRedirect5 = e.a;
                if (PatchProxy.isSupport(objArr5, a4, changeQuickRedirect5, false, "6e6f3b1d955b422fe8008791658d48a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, a4, changeQuickRedirect5, false, "6e6f3b1d955b422fe8008791658d48a8");
                } else if (a4.b != null) {
                    a4.a(a4.b.j, a4.b.a, (Map<String, Object>) null, B2);
                }
            }
        };
        this.d.a(this.e);
        int i = 0;
        while (i < this.c.size()) {
            boolean z = i == 0;
            TabLayout.d a3 = this.d.a();
            a3.a(R.layout.wm_ugc_media_bottom_tab_item);
            this.d.a(a3, z);
            com.sankuai.waimai.ugc.creator.entity.inner.b bVar = this.c.get(i);
            View view2 = a3.f;
            TextView textView = (TextView) view2.findViewById(R.id.tv_tab_title);
            ImageView imageView = (ImageView) view2.findViewById(R.id.iv_tab_indicator);
            textView.setText(bVar.b);
            if (bVar.a == 2) {
                a2 = g.a(B(), 48.0f);
            } else {
                a2 = g.a(B(), 32.0f);
            }
            ah.b(view2, a2, Integer.MIN_VALUE);
            if (z) {
                textView.setTextColor(Color.parseColor("#FFFFFF"));
                textView.setTextSize(2, 16.0f);
                textView.getPaint().setFakeBoldText(true);
                imageView.setVisibility(0);
            } else {
                textView.setTextColor(Color.parseColor("#80FFFFFF"));
                textView.setTextSize(2, 14.0f);
                textView.getPaint().setFakeBoldText(false);
                imageView.setVisibility(4);
            }
            i++;
        }
        if (d()) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.handler.c
    public final void a(List<ImageData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95eb1090caaa11d25193b94d5c515ca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95eb1090caaa11d25193b94d5c515ca5");
        } else if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            a(0);
        } else {
            a(8);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f8ec71a8f60b32239730752fcfd73a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f8ec71a8f60b32239730752fcfd73a");
        } else if (this.d == null || !d()) {
        } else {
            this.d.setVisibility(i);
        }
    }

    private boolean d() {
        return this.b.length > 1;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a() {
        Map<String, Object> hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbec4bb80b40f9fac326390f81778c45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbec4bb80b40f9fac326390f81778c45");
            return;
        }
        super.a();
        e a2 = e.a();
        Activity B = B();
        Object[] objArr2 = {B};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5c34370fbe9a5bffae8559f225440c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5c34370fbe9a5bffae8559f225440c97");
        } else if (a2.b != null) {
            String str = a2.b.a;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "e06a4777edadfedd6576ec0fc4e55d1f", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap = (Map) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "e06a4777edadfedd6576ec0fc4e55d1f");
            } else {
                hashMap = new HashMap<>();
                hashMap.put("custom", i.a().c().w);
            }
            a2.a(B, str, hashMap);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0a84aa83c3cf54cf209769cbf3f2b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0a84aa83c3cf54cf209769cbf3f2b5");
            return;
        }
        super.b();
        this.d.b(this.e);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final boolean a(com.sankuai.waimai.ugc.creator.framework.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18baa55712bae88575c8f35d5b9bab3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18baa55712bae88575c8f35d5b9bab3f")).booleanValue();
        }
        if (this.j != null) {
            return this.j.a(bVar);
        }
        return true;
    }
}
