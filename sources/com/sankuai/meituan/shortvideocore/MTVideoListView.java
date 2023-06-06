package com.sankuai.meituan.shortvideocore;

import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.util.Pair;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.mtplayer.video.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTVideoListView extends FrameLayout {
    public static ChangeQuickRedirect a;
    protected RecyclerView b;
    protected LinearLayoutManager c;
    protected com.sankuai.meituan.shortvideocore.adapter.a<com.sankuai.meituan.shortvideocore.adapter.item.a> d;
    private Context e;
    private b f;
    private h g;
    private boolean h;
    private int i;
    private int j;
    private com.sankuai.meituan.shortvideocore.a k;
    private com.sankuai.meituan.shortvideocore.statistics.a l;
    private a m;
    private int n;
    private boolean o;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(com.sankuai.meituan.shortvideocore.adapter.item.a aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        com.sankuai.meituan.shortvideocore.adapter.holder.a a(ViewGroup viewGroup, int i);
    }

    public static /* synthetic */ boolean a(MTVideoListView mTVideoListView, boolean z) {
        mTVideoListView.o = false;
        return false;
    }

    public MTVideoListView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731712affa933e6617f438baea2992a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731712affa933e6617f438baea2992a6");
        }
    }

    private MTVideoListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4537926f886754d5b7814679cf5fd61d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4537926f886754d5b7814679cf5fd61d");
        }
    }

    public MTVideoListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9855f64a57ac00d4c8931d7f778292b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9855f64a57ac00d4c8931d7f778292b");
            return;
        }
        this.h = true;
        this.j = 0;
        com.sankuai.meituan.shortvideocore.config.b.a = context.getApplicationContext();
        this.e = context;
        LayoutInflater.from(context).inflate(R.layout.short_video_recycler_view, this);
        com.sankuai.meituan.shortvideocore.config.a.a(context.getApplicationContext());
        this.b = (RecyclerView) findViewById(R.id.shortvideo_poison_recycler);
        this.g = new h();
        this.l = new com.sankuai.meituan.shortvideocore.statistics.a(context);
        this.l.a("LIST");
        this.d = new com.sankuai.meituan.shortvideocore.adapter.a<>(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "984d678a2be00194f9f261324650e09c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "984d678a2be00194f9f261324650e09c");
        } else if (this.e != null) {
            new com.sankuai.meituan.shortvideocore.utils.a().a(this.b);
            this.c = new LinearLayoutManager(this.e) { // from class: com.sankuai.meituan.shortvideocore.MTVideoListView.1
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "076258e55b3e3b4951e1edccbdb6721b", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "076258e55b3e3b4951e1edccbdb6721b")).booleanValue();
                    }
                    if (MTVideoListView.this.h) {
                        return super.canScrollVertically();
                    }
                    return false;
                }
            };
            this.b.setLayoutManager(this.c);
            this.b.addOnScrollListener(new c());
            this.d.i = this.l;
            this.b.setItemViewCacheSize(0);
            this.b.setHasFixedSize(true);
            this.b.setAdapter(this.d);
            this.b.post(new Runnable() { // from class: com.sankuai.meituan.shortvideocore.MTVideoListView.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8386cfbfe1d941c48310a62ca277596d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8386cfbfe1d941c48310a62ca277596d");
                        return;
                    }
                    MTVideoListView.this.d.f = MTVideoListView.this.b.getMeasuredHeight();
                }
            });
            this.d.g = new a() { // from class: com.sankuai.meituan.shortvideocore.MTVideoListView.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.shortvideocore.MTVideoListView.a
                public final void a(com.sankuai.meituan.shortvideocore.adapter.item.a aVar) {
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3cddd74e4eee4243a4b52ed524623622", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3cddd74e4eee4243a4b52ed524623622");
                        return;
                    }
                    if (MTVideoListView.this.m != null) {
                        MTVideoListView.this.m.a(aVar);
                    }
                    if (MTVideoListView.this.k != null) {
                        com.sankuai.meituan.shortvideocore.a aVar2 = MTVideoListView.this.k;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.shortvideocore.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "fa93e632a2c6ba7b198be34d44a92460", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "fa93e632a2c6ba7b198be34d44a92460")).booleanValue() : aVar2.b.a) {
                            int i2 = MTVideoListView.this.i + 1;
                            if (aVar.b != 7 || i2 >= MTVideoListView.this.d.getItemCount()) {
                                return;
                            }
                            MTVideoListView.this.a(i2);
                        }
                    }
                }
            };
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97420b7f374f7b6f84dd69660419039e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97420b7f374f7b6f84dd69660419039e");
            return;
        }
        super.onMeasure(i, i2);
        this.n = getMeasuredHeight();
    }

    public void setMTVideoListViewListener(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d3f7ee5da726c69a85375181032da6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d3f7ee5da726c69a85375181032da6a");
            return;
        }
        this.d.e = bVar;
        this.f = bVar;
    }

    public void setRecyclerViewCanScroll(boolean z) {
        this.h = z;
    }

    public void setMTVideoListPlayerListener(a aVar) {
        this.m = aVar;
    }

    public void setShowVideoProgressBar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55798d821cb47932691f3c0a91f07059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55798d821cb47932691f3c0a91f07059");
        } else {
            this.d.h = z;
        }
    }

    public void setJumpIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eedf159e971e9b6bfa722fa32803d993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eedf159e971e9b6bfa722fa32803d993");
        } else {
            this.d.d = i;
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "853d45c4bc173f55e04d72a22e4dedb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "853d45c4bc173f55e04d72a22e4dedb3");
            return;
        }
        new StringBuilder("smoothScrollToPosition: mMTVideoListViewHeight = ").append(this.n);
        int childLayoutPosition = this.b.getChildLayoutPosition(this.b.getChildAt(0));
        int childLayoutPosition2 = this.b.getChildLayoutPosition(this.b.getChildAt(this.b.getChildCount() - 1));
        if (i < childLayoutPosition) {
            if (i >= 0) {
                this.b.smoothScrollBy(0, (i - childLayoutPosition) * this.n);
            }
        } else if (i <= childLayoutPosition2) {
            int i2 = i - childLayoutPosition;
            if (i2 < 0 || i2 >= this.b.getChildCount()) {
                return;
            }
            this.b.smoothScrollBy(0, this.b.getChildAt(i2).getTop());
        } else {
            int size = getData().size();
            if (i > size) {
                i = size;
            }
            this.b.smoothScrollBy(0, (i - childLayoutPosition) * this.n);
        }
    }

    public int getPreShowPosition() {
        return this.j;
    }

    private int getCompatiblePosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4bf62af43e053b8e320beec230a5322", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4bf62af43e053b8e320beec230a5322")).intValue();
        }
        int findFirstVisibleItemPosition = this.c.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition != this.c.findLastVisibleItemPosition() || findFirstVisibleItemPosition == -1) {
            return -1;
        }
        return findFirstVisibleItemPosition;
    }

    public com.sankuai.meituan.shortvideocore.adapter.holder.a getCurrentShowHolder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9aa5d442bba99560f5d77335a89be3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.shortvideocore.adapter.holder.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9aa5d442bba99560f5d77335a89be3");
        }
        if (this.i != -1) {
            return (com.sankuai.meituan.shortvideocore.adapter.holder.a) this.b.findViewHolderForAdapterPosition(this.i);
        }
        return null;
    }

    public List<com.sankuai.meituan.shortvideocore.adapter.item.a> getData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e88aeffd04e6abd2255fa3b791071b66", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e88aeffd04e6abd2255fa3b791071b66") : this.d.a();
    }

    public void setData(List<com.sankuai.meituan.shortvideocore.adapter.item.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f45978f378f259cc956855bb0bfc2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f45978f378f259cc956855bb0bfc2a");
        } else {
            this.d.a(list);
        }
    }

    public h getPlayerManager() {
        return this.g;
    }

    public LiveData<com.sankuai.meituan.shortvideocore.adapter.item.a> getShortVideoPlayStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb5615b73dd2ee5545e52e535f3c0a64", RobustBitConfig.DEFAULT_VALUE) ? (LiveData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb5615b73dd2ee5545e52e535f3c0a64") : this.d.b;
    }

    public void setVideoListViewConfig(com.sankuai.meituan.shortvideocore.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77e62c239546b69567817b358e719960", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77e62c239546b69567817b358e719960");
            return;
        }
        this.k = aVar;
        if (this.d != null) {
            this.d.j = this.k;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class c extends RecyclerView.k {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;

        public c() {
            Object[] objArr = {MTVideoListView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d4091e703d5f3180e92afb3e820c582", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d4091e703d5f3180e92afb3e820c582");
            } else {
                this.c = 0;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Pair pair;
            Object[] objArr = {recyclerView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e95261c7356eee7692efe42a9114f86", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e95261c7356eee7692efe42a9114f86");
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (MTVideoListView.this.f != null) {
                b unused = MTVideoListView.this.f;
            }
            if (MTVideoListView.this.l != null) {
                com.sankuai.meituan.shortvideocore.statistics.a aVar = MTVideoListView.this.l;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.shortvideocore.statistics.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "396fdf9251975ca546a56e8ce327b37a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "396fdf9251975ca546a56e8ce327b37a");
                } else if (i == 2) {
                    aVar.e = System.currentTimeMillis();
                } else if (i == 1) {
                    aVar.e = 0L;
                }
            }
            new StringBuilder("MyScrollListener onScrollStateChanged: newState = ").append(i);
            if (i == 1) {
                if (MTVideoListView.this.i == MTVideoListView.this.j && MTVideoListView.this.i == 0) {
                    b(recyclerView);
                }
            } else if (i == 2) {
                Object[] objArr3 = {recyclerView};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b84b872953fea58c8e273f6347d2c4c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b84b872953fea58c8e273f6347d2c4c6");
                } else {
                    Object[] objArr4 = {recyclerView};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "31cdb0d9873c0257449473e11ba37ee2", RobustBitConfig.DEFAULT_VALUE)) {
                        pair = (Pair) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "31cdb0d9873c0257449473e11ba37ee2");
                    } else {
                        int childCount = recyclerView.getChildCount();
                        if (childCount > 1) {
                            pair = new Pair(Integer.valueOf(((com.sankuai.meituan.shortvideocore.adapter.holder.a) recyclerView.getChildViewHolder(recyclerView.getChildAt(0))).a().a), Integer.valueOf(((com.sankuai.meituan.shortvideocore.adapter.holder.a) recyclerView.getChildViewHolder(recyclerView.getChildAt(1))).a().a));
                        } else {
                            pair = childCount > 0 ? new Pair(Integer.valueOf(((com.sankuai.meituan.shortvideocore.adapter.holder.a) recyclerView.getChildViewHolder(recyclerView.getChildAt(0))).a().a), null) : null;
                        }
                    }
                    if (pair != null) {
                        Integer num = (Integer) pair.second;
                        int intValue = ((Integer) pair.first).intValue();
                        int intValue2 = num != null ? num.intValue() : -1;
                        StringBuilder sb = new StringBuilder("onScrollUp: first = ");
                        sb.append(intValue);
                        sb.append(" second = ");
                        sb.append(intValue2);
                        com.sankuai.meituan.shortvideocore.adapter.holder.a aVar2 = (com.sankuai.meituan.shortvideocore.adapter.holder.a) recyclerView.findViewHolderForAdapterPosition(intValue);
                        com.sankuai.meituan.shortvideocore.adapter.holder.a aVar3 = num != null ? (com.sankuai.meituan.shortvideocore.adapter.holder.a) recyclerView.findViewHolderForAdapterPosition(intValue2) : null;
                        if (this.c > 0) {
                            if (aVar2 != null) {
                                new StringBuilder("onScrollUp: firstHolder pause ").append(intValue);
                                aVar2.b(false);
                            }
                            if (aVar3 != null) {
                                MTVideoListView.this.i = intValue2;
                                MTVideoListView.this.j = MTVideoListView.this.i;
                                new StringBuilder("onScrollUp: secondHolder start ").append(intValue2);
                                aVar3.a(false);
                            }
                        } else if (this.c < 0) {
                            if (aVar3 != null) {
                                new StringBuilder("onScrollUp: secondHolder pause ").append(intValue2);
                                aVar3.b(false);
                            }
                            if (aVar2 != null) {
                                MTVideoListView.this.i = intValue;
                                MTVideoListView.this.j = MTVideoListView.this.i;
                                new StringBuilder("onScrollUp: firstHolder start ").append(intValue);
                                aVar2.a(false);
                            }
                        }
                    }
                }
            } else if (i == 0) {
                b(recyclerView);
                this.c = 0;
            }
            this.d = i;
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d184e5ba3488724f2505072147d5998", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d184e5ba3488724f2505072147d5998");
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (Math.abs(i2) <= Math.abs(this.c)) {
                i2 = this.c;
            }
            this.c = i2;
            if (MTVideoListView.this.f != null) {
                b unused = MTVideoListView.this.f;
            }
        }

        private void a(RecyclerView recyclerView) {
            Object[] objArr = {recyclerView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b0b983334ff41017ae86767cae16b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b0b983334ff41017ae86767cae16b0");
                return;
            }
            if (!MTVideoListView.this.o) {
                RecyclerView.s findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(MTVideoListView.this.i);
                if (findViewHolderForAdapterPosition instanceof com.sankuai.meituan.shortvideocore.adapter.holder.a) {
                    ((com.sankuai.meituan.shortvideocore.adapter.holder.a) findViewHolderForAdapterPosition).a(false);
                }
            }
            MTVideoListView.a(MTVideoListView.this, false);
        }

        private void b(RecyclerView recyclerView) {
            Object[] objArr = {recyclerView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2522bf2bed9d444e492dce8f81520be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2522bf2bed9d444e492dce8f81520be");
                return;
            }
            int findFirstCompletelyVisibleItemPosition = MTVideoListView.this.c.findFirstCompletelyVisibleItemPosition();
            int findLastVisibleItemPosition = MTVideoListView.this.c.findLastVisibleItemPosition();
            new StringBuilder("MyScrollListener onScrollEnd: FirstCompletelyVisible currentShowPosition ").append(findFirstCompletelyVisibleItemPosition);
            new StringBuilder("MyScrollListener onScrollEnd: ").append(MTVideoListView.this.i);
            if (findFirstCompletelyVisibleItemPosition == MTVideoListView.this.i) {
                MTVideoListView.this.j = MTVideoListView.this.i;
                c(recyclerView);
                a(recyclerView);
                if (MTVideoListView.this.f != null) {
                    b unused = MTVideoListView.this.f;
                    return;
                }
                return;
            }
            RecyclerView.s findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(MTVideoListView.this.i);
            if (findViewHolderForAdapterPosition instanceof com.sankuai.meituan.shortvideocore.adapter.holder.b) {
                ((com.sankuai.meituan.shortvideocore.adapter.holder.b) findViewHolderForAdapterPosition).b(false);
            }
            if (findFirstCompletelyVisibleItemPosition != -1) {
                MTVideoListView.this.i = findFirstCompletelyVisibleItemPosition;
            }
            StringBuilder sb = new StringBuilder("MyScrollListener onScrollEnd  :, currentShowPosition: ");
            sb.append(findFirstCompletelyVisibleItemPosition);
            sb.append(", lastVisibleItemPosition: ");
            sb.append(findLastVisibleItemPosition);
            sb.append(", dy: ");
            sb.append(this.c);
            sb.append(", itemCount: ");
            sb.append(MTVideoListView.this.d.getItemCount());
            StringBuilder sb2 = new StringBuilder("MyScrollListener onScrollEnd mLastPosition :");
            sb2.append(MTVideoListView.this.j);
            sb2.append(", mCurrentPosition: ");
            sb2.append(MTVideoListView.this.i);
            sb2.append(", lastVisibleItemPosition: ");
            sb2.append(findLastVisibleItemPosition);
            sb2.append(", dy: ");
            sb2.append(this.c);
            sb2.append(", itemCount: ");
            sb2.append(MTVideoListView.this.d.getItemCount());
            if (this.c > 0 && MTVideoListView.this.i + 1 == MTVideoListView.this.d.getItemCount()) {
                MTVideoListView.this.i = findLastVisibleItemPosition;
            }
            c(recyclerView);
            if (MTVideoListView.this.i == -1) {
                return;
            }
            a(recyclerView);
            if (MTVideoListView.this.f != null) {
                b unused2 = MTVideoListView.this.f;
            }
            if (MTVideoListView.this.i == MTVideoListView.this.j) {
                return;
            }
            MTVideoListView.this.j = MTVideoListView.this.i;
        }

        private void c(RecyclerView recyclerView) {
            Object[] objArr = {recyclerView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "188b850fd9d0b97e2c0a491f135dd554", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "188b850fd9d0b97e2c0a491f135dd554");
                return;
            }
            RecyclerView.s findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.c > 0 ? MTVideoListView.this.i - 1 : MTVideoListView.this.i + 1);
            new StringBuilder("MyScrollListener lastViewHolder: ").append(findViewHolderForAdapterPosition);
            if (findViewHolderForAdapterPosition instanceof com.sankuai.meituan.shortvideocore.adapter.holder.b) {
                ((com.sankuai.meituan.shortvideocore.adapter.holder.b) findViewHolderForAdapterPosition).g();
            }
        }
    }

    public int getCurrentShowPosition() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "998e9ab971d625378c0a2a40e20f79f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "998e9ab971d625378c0a2a40e20f79f3")).intValue();
        }
        if ((this.b == null || this.d == null || this.c == null) ? true : true) {
            return -1;
        }
        return this.i;
    }
}
