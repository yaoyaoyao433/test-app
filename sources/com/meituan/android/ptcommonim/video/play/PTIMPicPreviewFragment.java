package com.meituan.android.ptcommonim.video.play;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.gson.JsonArray;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.mach.HangoutMachContainer;
import com.meituan.android.ptcommonim.mach.e;
import com.meituan.android.ptcommonim.video.PTIMVideoBaseFragment;
import com.meituan.android.ptcommonim.video.model.PicPreviewParam;
import com.meituan.android.ptcommonim.video.utils.g;
import com.meituan.android.ptcommonim.video.widget.PicPreviewBottomView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.model.CollectionUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTIMPicPreviewFragment extends PTIMVideoBaseFragment {
    public static ChangeQuickRedirect c;
    private PicPreviewParam d;
    private ViewPager e;
    private PicPreviewBottomView h;
    private PagerAdapter i;
    private final LinkedList<View> j;
    private ImageView k;
    private HangoutMachContainer l;
    private e m;
    private boolean n;
    private int o;
    private int p;

    public PTIMPicPreviewFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f4cb5866b47cbb28038e5c4269f11e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f4cb5866b47cbb28038e5c4269f11e");
            return;
        }
        this.j = new LinkedList<>();
        this.n = false;
    }

    public static PTIMPicPreviewFragment a(PicPreviewParam picPreviewParam, PTIMCommonBean pTIMCommonBean) {
        Object[] objArr = {picPreviewParam, pTIMCommonBean};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f159253f1dacb53f93726c90fc6dcad", RobustBitConfig.DEFAULT_VALUE)) {
            return (PTIMPicPreviewFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f159253f1dacb53f93726c90fc6dcad");
        }
        PTIMPicPreviewFragment pTIMPicPreviewFragment = new PTIMPicPreviewFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("previewParam", picPreviewParam);
        bundle.putParcelable("commonBean", pTIMCommonBean);
        pTIMPicPreviewFragment.setArguments(bundle);
        return pTIMPicPreviewFragment;
    }

    @Override // com.meituan.android.ptcommonim.video.PTIMVideoBaseFragment, com.sankuai.android.spawn.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a91188c03637f85458654e5802acecc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a91188c03637f85458654e5802acecc6");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c82a01459cba2e944286e1c5bd59164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c82a01459cba2e944286e1c5bd59164");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.d = (PicPreviewParam) arguments.getParcelable("previewParam");
            if (this.d != null) {
                PicPreviewParam picPreviewParam = this.d;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = PicPreviewParam.a;
                if (PatchProxy.isSupport(objArr3, picPreviewParam, changeQuickRedirect3, false, "cd98cb858fa7e054228919de4c3a21ff", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, picPreviewParam, changeQuickRedirect3, false, "cd98cb858fa7e054228919de4c3a21ff")).booleanValue();
                } else if (CollectionUtils.isEmpty(picPreviewParam.b)) {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
        }
        com.meituan.android.ptcommonim.video.utils.a.b(getActivity());
    }

    @Override // com.sankuai.android.spawn.base.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4bfcbd78e7f988be1292f7917a282f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4bfcbd78e7f988be1292f7917a282f2");
            return;
        }
        super.onResume();
        g.a(this.b, this.d.f, "picture", this.n ? "1" : "0");
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b7118a7e9546ab589a781282f50017e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b7118a7e9546ab589a781282f50017e") : layoutInflater.inflate(R.layout.ptim_commonbus_pic_play, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        int i;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6a5be617d9d6956874ab08ed6f8c42b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6a5be617d9d6956874ab08ed6f8c42b");
            return;
        }
        super.onViewCreated(view, bundle);
        this.m = new e(getActivity());
        this.e = (ViewPager) view.findViewById(R.id.pic_preview_view_pager);
        this.h = (PicPreviewBottomView) view.findViewById(R.id.pic_preview_bottom_view);
        this.k = (ImageView) view.findViewById(R.id.pic_preview_close_img);
        this.l = (HangoutMachContainer) view.findViewById(R.id.mach_card_container);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b9c9f108f37e0506c6f3eaa571d9eaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b9c9f108f37e0506c6f3eaa571d9eaa");
            return;
        }
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPicPreviewFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr3 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "19b9782e7a6ce80230eaac6fbfaedd51", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "19b9782e7a6ce80230eaac6fbfaedd51");
                } else {
                    com.meituan.android.ptcommonim.video.utils.a.b(PTIMPicPreviewFragment.this.getActivity());
                }
            }
        });
        this.i = new PagerAdapter() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPicPreviewFragment.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.PagerAdapter
            public boolean isViewFromObject(@NonNull View view2, @NonNull Object obj) {
                return view2 == obj;
            }

            @Override // android.support.v4.view.PagerAdapter
            public int getCount() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "117191b662a13caea7d639501ea6c0b0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "117191b662a13caea7d639501ea6c0b0")).intValue() : PTIMPicPreviewFragment.this.d.b.size();
            }

            @Override // android.support.v4.view.PagerAdapter
            public void destroyItem(@NonNull ViewGroup viewGroup, int i2, @NonNull Object obj) {
                Object[] objArr3 = {viewGroup, Integer.valueOf(i2), obj};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "85751826eb6834f996187cdffbda7ab9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "85751826eb6834f996187cdffbda7ab9");
                    return;
                }
                View view2 = (View) obj;
                viewGroup.removeView(view2);
                PTIMPicPreviewFragment.this.j.add(view2);
            }

            @Override // android.support.v4.view.PagerAdapter
            @NonNull
            public Object instantiateItem(@NonNull ViewGroup viewGroup, int i2) {
                Object[] objArr3 = {viewGroup, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c7d3d5ad32821b26f391fc521d752001", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c7d3d5ad32821b26f391fc521d752001");
                }
                ImageView imageView = PTIMPicPreviewFragment.this.j.size() > 0 ? (ImageView) PTIMPicPreviewFragment.this.j.removeFirst() : null;
                if (imageView == null) {
                    imageView = new ImageView(PTIMPicPreviewFragment.this.getContext());
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView.setAdjustViewBounds(true);
                    imageView.setLayoutParams(layoutParams);
                }
                try {
                    com.meituan.android.singleton.g.a().d(PTIMPicPreviewFragment.this.d.b.get(i2).b).a(imageView);
                } catch (Throwable unused) {
                }
                viewGroup.addView(imageView);
                return imageView;
            }
        };
        this.e.setAdapter(this.i);
        this.e.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPicPreviewFragment.3
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                Object[] objArr3 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3ad5c404f8d8426df99a7599df4ba5b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3ad5c404f8d8426df99a7599df4ba5b0");
                    return;
                }
                if (i2 > PTIMPicPreviewFragment.this.p) {
                    PTIMCommonBean pTIMCommonBean = PTIMPicPreviewFragment.this.b;
                    JSONObject jSONObject = PTIMPicPreviewFragment.this.d.f;
                    String str = PTIMPicPreviewFragment.this.n ? "1" : "0";
                    Object[] objArr4 = {pTIMCommonBean, jSONObject, str};
                    ChangeQuickRedirect changeQuickRedirect4 = g.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "45a67ab9a4d2ebf334449746201688b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "45a67ab9a4d2ebf334449746201688b6");
                    } else {
                        HashMap hashMap = new HashMap();
                        Map<String, Object> a2 = g.a(pTIMCommonBean, jSONObject);
                        a2.put("show_status", str);
                        hashMap.putAll(a2);
                        Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_5xlvdjbg_mc", hashMap, "c_group_plkiwka4");
                    }
                }
                if (PTIMPicPreviewFragment.this.o > 1) {
                    PTIMPicPreviewFragment.this.h.setCheckIndex(i2);
                }
                PTIMPicPreviewFragment.this.p = i2;
            }
        });
        this.o = this.d.b.size();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1e559634b71b61b63a0ec2a225be08d5", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1e559634b71b61b63a0ec2a225be08d5")).intValue();
        } else if (this.d.c == null) {
            i = 0;
        } else {
            int size = this.d.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = 0;
                    break;
                } else if (TextUtils.equals(this.d.b.get(i2).b, this.d.c.b)) {
                    break;
                } else {
                    i2++;
                }
            }
            i = i2;
        }
        this.p = i;
        this.e.setCurrentItem(this.p);
        if (this.o > 1) {
            this.h.setPicNumber(this.o);
            this.h.setCheckIndex(this.p);
        } else {
            this.h.setVisibility(8);
        }
        String str = this.d.d;
        Object[] objArr4 = {str};
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "83580f5855c191897baa8022ae085d58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "83580f5855c191897baa8022ae085d58");
            return;
        }
        JsonArray jsonArray = JsonHelper.toJsonArray(str);
        if (jsonArray == null || jsonArray.size() == 0) {
            return;
        }
        this.n = this.l.a(str, this.b, this.d.f, "picture");
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa0a85824529b4fdef7cc8dd2e20773a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa0a85824529b4fdef7cc8dd2e20773a");
            return;
        }
        super.onDestroyView();
        this.m.a();
    }
}
