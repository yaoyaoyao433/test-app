package com.sankuai.meituan.shortvideocore.adapter;

import android.arch.lifecycle.k;
import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.proxy.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.shortvideocore.MTVideoListView;
import com.sankuai.meituan.shortvideocore.adapter.holder.b;
import com.sankuai.meituan.shortvideocore.adapter.item.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a<T extends com.sankuai.meituan.shortvideocore.adapter.item.a> extends RecyclerView.a<com.sankuai.meituan.shortvideocore.adapter.holder.a> {
    public static ChangeQuickRedirect a;
    public final k<com.sankuai.meituan.shortvideocore.adapter.item.a> b;
    protected List<T> c;
    public int d;
    public MTVideoListView.b e;
    public int f;
    public MTVideoListView.a g;
    public boolean h;
    public com.sankuai.meituan.shortvideocore.statistics.a i;
    public com.sankuai.meituan.shortvideocore.a j;
    private MTVideoListView k;
    private final HashMap<Integer, VideoPlayerParam> l;
    private final m.b m;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(com.sankuai.meituan.shortvideocore.adapter.holder.a aVar, int i) {
        com.sankuai.meituan.shortvideocore.adapter.holder.a aVar2 = aVar;
        boolean z = false;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924724bf65e0102876d932bba870b941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924724bf65e0102876d932bba870b941");
            return;
        }
        T t = this.c.get(i);
        t.a = aVar2.getAdapterPosition();
        t.c = (i == this.k.getCurrentShowPosition() && this.d == i) ? true : true;
        StringBuilder sb = new StringBuilder("onBindViewHolder: position = ");
        sb.append(i);
        sb.append("---> shortVideoBaseItem.position = ");
        sb.append(t.a);
        sb.append("-->getCurrentShowPosition = ");
        sb.append(this.k.getCurrentShowPosition());
        sb.append("-->jumpIndex = ");
        sb.append(this.d);
        a(i);
        aVar2.a(this.j);
        aVar2.a(this.i);
        aVar2.a((com.sankuai.meituan.shortvideocore.adapter.holder.a) t);
        aVar2.a(this.b);
        aVar2.a(this.g);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ com.sankuai.meituan.shortvideocore.adapter.holder.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.sankuai.meituan.shortvideocore.adapter.holder.a a2;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2697c0f421df9b15bbe733498d1c315", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.shortvideocore.adapter.holder.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2697c0f421df9b15bbe733498d1c315");
        }
        if (this.e == null || (a2 = this.e.a(viewGroup, i)) == null) {
            if (i == 2) {
                new StringBuilder("onCreateViewHolder: ").append(this.f);
            }
            return a(viewGroup);
        }
        return a2;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(com.sankuai.meituan.shortvideocore.adapter.holder.a aVar) {
        com.sankuai.meituan.shortvideocore.adapter.holder.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "793154e3d00bb477713a274049523905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "793154e3d00bb477713a274049523905");
            return;
        }
        super.onViewAttachedToWindow(aVar2);
        if (aVar2 != null) {
            aVar2.e();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewDetachedFromWindow(com.sankuai.meituan.shortvideocore.adapter.holder.a aVar) {
        com.sankuai.meituan.shortvideocore.adapter.holder.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7838ecbe43af900f905280e269765a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7838ecbe43af900f905280e269765a0e");
            return;
        }
        super.onViewDetachedFromWindow(aVar2);
        if (aVar2 != null) {
            aVar2.f();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(com.sankuai.meituan.shortvideocore.adapter.holder.a aVar) {
        com.sankuai.meituan.shortvideocore.adapter.holder.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66150eba1dd0156bd89ec879c904a9d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66150eba1dd0156bd89ec879c904a9d9");
            return;
        }
        super.onViewRecycled(aVar2);
        if (aVar2 != null) {
            aVar2.d();
        }
    }

    public a(MTVideoListView mTVideoListView) {
        Object[] objArr = {mTVideoListView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6971cac03c738ff4bf24a97ccef82ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6971cac03c738ff4bf24a97ccef82ef");
            return;
        }
        this.b = new k<>();
        this.d = -1;
        this.f = 0;
        this.h = true;
        this.l = new HashMap<>();
        this.m = new m.c() { // from class: com.sankuai.meituan.shortvideocore.adapter.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.proxy.m.b
            public final void a(String str) {
            }

            @Override // com.meituan.android.mtplayer.video.proxy.m.b
            public final void a(String str, int i) {
            }

            @Override // com.meituan.android.mtplayer.video.proxy.m.b
            public final void a(String str, Exception exc) {
            }

            @Override // com.meituan.android.mtplayer.video.proxy.m.c
            public final void a(String str, int i, long j) {
                Object[] objArr2 = {str, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d145b996661f622cace95be39765cf2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d145b996661f622cace95be39765cf2");
                    return;
                }
                StringBuilder sb = new StringBuilder("onPreDownloadSizeDone: percent = ");
                sb.append(i);
                sb.append(" size = ");
                sb.append(j);
                sb.append(" url = ");
                sb.append(str);
            }
        };
        this.k = mTVideoListView;
        this.c = new ArrayList();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc0f50128e9c507d5196e3d88e128e36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc0f50128e9c507d5196e3d88e128e36");
        } else {
            super.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "574beb73237a537251a66987bd7e652a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "574beb73237a537251a66987bd7e652a");
        } else {
            super.onDetachedFromRecyclerView(recyclerView);
        }
    }

    private b a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3083a83f50e6fb5ec055a81ca8bf16", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3083a83f50e6fb5ec055a81ca8bf16");
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shortvideo_core_video_item, viewGroup, false);
        if (this.f > 0) {
            inflate.setLayoutParams(new RecyclerView.g(com.sankuai.meituan.shortvideocore.utils.b.b(viewGroup.getContext()), this.f - 1));
        } else {
            inflate.setLayoutParams(new RecyclerView.g(-1, -1));
        }
        b bVar = new b(inflate);
        bVar.f = this.h;
        bVar.n = this.k.getPlayerManager();
        return bVar;
    }

    private void a(int i) {
        VideoPlayerParam remove;
        Context context;
        long j;
        char c = 1;
        char c2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dbf5fbc2e18cae57c83f3130d2db985", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dbf5fbc2e18cae57c83f3130d2db985");
        } else if (this.k == null || this.c == null) {
        } else {
            Context context2 = this.k.getContext();
            if (com.sankuai.meituan.shortvideocore.config.a.a(context2).b) {
                int i2 = com.sankuai.meituan.shortvideocore.config.a.a(context2).c;
                int size = this.c.size();
                int i3 = i + i2;
                int i4 = i;
                while (i4 < i3) {
                    if (size <= i4) {
                        return;
                    }
                    T t = this.c.get(i4);
                    if (t instanceof com.sankuai.meituan.shortvideocore.adapter.item.b) {
                        com.sankuai.meituan.shortvideocore.adapter.item.b bVar = (com.sankuai.meituan.shortvideocore.adapter.item.b) t;
                        VideoPlayerParam videoPlayerParam = new VideoPlayerParam(bVar.e);
                        videoPlayerParam.a(context2.getApplicationContext(), "short_video_cache");
                        long j2 = com.sankuai.meituan.shortvideocore.config.a.a(context2).d * 1024;
                        new StringBuilder("preDownLoadNextItemStrategy: preDownloadSize  = ").append(j2);
                        Object[] objArr2 = new Object[2];
                        objArr2[c2] = bVar;
                        objArr2[c] = new Long(j2);
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        context = context2;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "343543372e63e40ac66baeee8f6731c9", RobustBitConfig.DEFAULT_VALUE)) {
                            j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "343543372e63e40ac66baeee8f6731c9")).longValue();
                        } else {
                            long j3 = bVar.i;
                            if (j3 > 0) {
                                long min = Math.min(Math.max((((long) Math.ceil(((float) j3) / 1000.0f)) * 512) + 1125000, j2), 1572864L);
                                new StringBuilder("preDownLoadNextItemStrategy: shortVideoItem.videoDuration  = ").append(j3);
                                new StringBuilder("preDownLoadNextItemStrategy: resultPreDownloadSize  update = ").append(min);
                                j = min;
                            } else {
                                j = j2;
                            }
                        }
                        videoPlayerParam.a(this.m, m.d.a(j));
                        this.l.put(Integer.valueOf(i4), videoPlayerParam);
                    } else {
                        context = context2;
                    }
                    i4++;
                    context2 = context;
                    c = 1;
                    c2 = 0;
                }
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf2ff69bea95e4b9a0347b50cb87ecb8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf2ff69bea95e4b9a0347b50cb87ecb8");
                } else if (this.l == null || !this.l.containsKey(Integer.valueOf(i)) || (remove = this.l.remove(Integer.valueOf(i))) == null) {
                } else {
                    new StringBuilder("removePreDownLoadNextItemMapIndex: ").append(i);
                    remove.e();
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a59e87cfd4c6cf0ed4ca6c991d5f57", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a59e87cfd4c6cf0ed4ca6c991d5f57")).intValue();
        }
        if (this.c == null || this.c.size() == 0) {
            return 1;
        }
        this.c.get(i);
        return 2;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ab80f8f0e5d27718e64a2ab2c6830f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ab80f8f0e5d27718e64a2ab2c6830f")).intValue();
        }
        if (this.c == null || this.c.size() == 0) {
            return 0;
        }
        return this.c.size();
    }

    public final List<T> a() {
        return this.c;
    }

    public final void a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35f79739596870f14ca48167c00ee69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35f79739596870f14ca48167c00ee69");
        } else if (list == null) {
        } else {
            this.c.addAll(list);
            notifyDataSetChanged();
        }
    }
}
