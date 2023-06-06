package com.sankuai.xm.imui.common.panel.plugin.view;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.aq;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.log.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class TabPagerView<D> extends RelativeLayout {
    public static ChangeQuickRedirect b;
    private final List<D> a;
    protected final RecyclerView c;
    protected final PageView d;
    private TabPagerView<D>.b e;

    public abstract View a(@NonNull ViewGroup viewGroup, int i, D d);

    public TabPagerView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1493f30fbedc8c6bd20c68a960b37b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1493f30fbedc8c6bd20c68a960b37b");
        }
    }

    private TabPagerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "691381703e82e5f1328b27192db4a1d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "691381703e82e5f1328b27192db4a1d2");
        }
    }

    public TabPagerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8927446d7195e6cb01f308cc3cd5cfb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8927446d7195e6cb01f308cc3cd5cfb");
            return;
        }
        this.a = new ArrayList();
        setGravity(80);
        inflate(context, R.layout.xm_sdk_emotion_option_view, this);
        this.c = (RecyclerView) findViewById(R.id.xm_sdk_view_tab);
        this.d = (PageView) findViewById(R.id.xm_sdk_page_view);
        this.d.getPager().addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.TabPagerView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82a479aad939c74bd467e484d9f94fc6", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82a479aad939c74bd467e484d9f94fc6");
                } else {
                    TabPagerView.this.e.a(i2);
                }
            }
        });
        this.d.a(new PagerAdapter() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.TabPagerView.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.PagerAdapter
            public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
                return view == obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.support.v4.view.PagerAdapter
            @NonNull
            public Object instantiateItem(@NonNull ViewGroup viewGroup, int i2) {
                Object[] objArr2 = {viewGroup, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7a0d5c4a1de3e7bbed31bb2e6276c25", 6917529027641081856L)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7a0d5c4a1de3e7bbed31bb2e6276c25");
                }
                View a2 = TabPagerView.this.a(viewGroup, i2, TabPagerView.this.a.get(i2));
                viewGroup.addView(a2);
                return a2;
            }

            @Override // android.support.v4.view.PagerAdapter
            public void destroyItem(@NonNull ViewGroup viewGroup, int i2, @NonNull Object obj) {
                Object[] objArr2 = {viewGroup, Integer.valueOf(i2), obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d9406fd115b7382b7973ee74d937e1a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d9406fd115b7382b7973ee74d937e1a");
                } else {
                    viewGroup.removeView((View) obj);
                }
            }

            @Override // android.support.v4.view.PagerAdapter
            public int getCount() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c715ded40c5e50499cdb72f25b34958d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c715ded40c5e50499cdb72f25b34958d")).intValue() : com.sankuai.xm.base.util.b.b(TabPagerView.this.a);
            }
        });
        ((aq) this.c.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    public void setTabBarAdapter(TabPagerView<D>.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7396ca64f2e28991d840e5f8a139fcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7396ca64f2e28991d840e5f8a139fcb");
            return;
        }
        this.e = bVar;
        if (this.e == null || this.e.getItemCount() <= 0) {
            this.c.setVisibility(8);
            return;
        }
        this.e.e = this.d;
        this.c.setVisibility(0);
        this.c.setHasFixedSize(true);
        this.c.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.c.setAdapter(this.e);
        this.c.scrollToPosition(0);
    }

    public List<D> getData() {
        return this.a;
    }

    public final void a(final List<D> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe7bb9c5aea4d77b064164b5c6ab64bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe7bb9c5aea4d77b064164b5c6ab64bd");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            b(list);
        } else {
            m.e().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.TabPagerView.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "582f3d70cc0b9afcc1a5feb0f3b3882c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "582f3d70cc0b9afcc1a5feb0f3b3882c");
                    } else {
                        TabPagerView.this.b(list);
                    }
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<D> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5361a3607a10479721938578f8b837d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5361a3607a10479721938578f8b837d");
            return;
        }
        c.b("TabPagerView", "doRefresh data size = " + com.sankuai.xm.base.util.b.b(list), new Object[0]);
        this.a.clear();
        if (!com.sankuai.xm.base.util.b.a(list)) {
            this.a.addAll(list);
        }
        if (this.e != null) {
            this.e.notifyDataSetChanged();
        }
        if (this.d.getPager().getAdapter() != null) {
            this.d.getPager().getAdapter().notifyDataSetChanged();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public abstract class b extends RecyclerView.a<a> {
        public static ChangeQuickRedirect c;
        int d;
        PageView e;

        public abstract a a(@NonNull ViewGroup viewGroup, int i);

        public abstract void a(@NonNull a aVar, int i, D d);

        public b() {
            Object[] objArr = {TabPagerView.this};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc73c427ba764c2f6e46f80b8dd65d31", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc73c427ba764c2f6e46f80b8dd65d31");
            } else {
                this.d = 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.support.v7.widget.RecyclerView.a
        public /* synthetic */ void onBindViewHolder(@NonNull a aVar, int i) {
            a aVar2 = aVar;
            Object[] objArr = {aVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecbf0c8cf5890c856b725c6cad93ca7d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecbf0c8cf5890c856b725c6cad93ca7d");
                return;
            }
            a(aVar2, i, (i < 0 || i >= com.sankuai.xm.base.util.b.b(TabPagerView.this.a)) ? null : TabPagerView.this.a.get(i));
            aVar2.b.setSelected(this.d == aVar2.getLayoutPosition());
        }

        @Override // android.support.v7.widget.RecyclerView.a
        @NonNull
        public /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c178a3ebc5185352652a24b47a42f4", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c178a3ebc5185352652a24b47a42f4");
            }
            final a a = a(viewGroup, i);
            a.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.TabPagerView.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9279417b4d98c7b2add607c4ad01c8bd", 6917529027641081858L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9279417b4d98c7b2add607c4ad01c8bd");
                        return;
                    }
                    int layoutPosition = a.getLayoutPosition();
                    if (layoutPosition != b.this.d) {
                        b.this.a(layoutPosition);
                    }
                }
            });
            return a;
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a62f3a025c889612b706ee6acce97503", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a62f3a025c889612b706ee6acce97503");
            } else if (i == this.d) {
            } else {
                notifyItemChanged(this.d);
                this.d = i;
                notifyItemChanged(i);
                if (this.e.getPager().getCurrentItem() != i) {
                    this.e.getPager().setCurrentItem(i, false);
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "637333669994b804f9f051f3d43d584a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "637333669994b804f9f051f3d43d584a")).intValue() : com.sankuai.xm.base.util.b.b(TabPagerView.this.a);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends com.sankuai.xm.imui.common.view.a {
        public View b;

        public a(View view, int i) {
            super(view);
            if (i != 0) {
                this.b = view.findViewById(i);
            }
        }
    }
}
