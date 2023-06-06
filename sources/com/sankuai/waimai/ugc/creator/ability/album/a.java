package com.sankuai.waimai.ugc.creator.ability.album;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.v;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.waimai.ugc.creator.ability.album.directory.AlbumDirectoryListPopup;
import com.sankuai.waimai.ugc.creator.ability.album.preview.MediaPreviewDialogFragment;
import com.sankuai.waimai.ugc.creator.ability.album.utils.a;
import com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.handler.e;
import com.sankuai.waimai.ugc.creator.utils.c;
import com.sankuai.waimai.ugc.creator.utils.g;
import com.sankuai.waimai.ugc.creator.utils.j;
import com.sankuai.waimai.ugc.creator.utils.m;
import com.sankuai.waimai.ugc.creator.utils.n;
import com.sankuai.waimai.ugc.creator.utils.o;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.ugc.creator.base.a implements FlowLineActionBarBlock.b, e {
    public static ChangeQuickRedirect a;
    private AlbumDirectoryListPopup A;
    private View B;
    private TextView C;
    private View D;
    private b E;
    private Picasso F;
    private com.sankuai.waimai.ugc.creator.ability.album.utils.a G;
    private List<ImageData> H;
    MediaPreviewDialogFragment b;
    private FlowLineActionBarBlock c;
    private int d;
    private int z;

    public static /* synthetic */ void a(a aVar, int i) {
        com.sankuai.waimai.ugc.creator.entity.inner.a aVar2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "68aa971e51ae546f9ce430d87b0b764d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "68aa971e51ae546f9ce430d87b0b764d");
            return;
        }
        com.sankuai.waimai.ugc.creator.ability.album.utils.a aVar3 = aVar.G;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ugc.creator.ability.album.utils.a.a;
        if (PatchProxy.isSupport(objArr2, aVar3, changeQuickRedirect2, false, "14a0ed1751cfff9997f7a44dd2c2b2ae", RobustBitConfig.DEFAULT_VALUE)) {
            aVar2 = (com.sankuai.waimai.ugc.creator.entity.inner.a) PatchProxy.accessDispatch(objArr2, aVar3, changeQuickRedirect2, false, "14a0ed1751cfff9997f7a44dd2c2b2ae");
        } else {
            aVar2 = (i < 0 || i >= aVar3.d.size()) ? null : aVar3.d.get(i);
        }
        if (aVar2 != null) {
            aVar.c.a(aVar2.c);
            aVar.E.a(i);
        }
    }

    public static /* synthetic */ void i(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d4f4a8232ad3445af3250409655dec96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d4f4a8232ad3445af3250409655dec96");
        } else {
            aVar.c.a(aVar.e(), aVar.o.j);
        }
    }

    public static /* synthetic */ void k(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "de0f0a48ec61f1ae6388f755179eac3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "de0f0a48ec61f1ae6388f755179eac3d");
        } else {
            o.a(aVar.B());
        }
    }

    public a(Fragment fragment) {
        super(fragment);
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eccdc3e651207d4f0d061554837358f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eccdc3e651207d4f0d061554837358f");
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bae65c807c1ab5e9a832df5b94204ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bae65c807c1ab5e9a832df5b94204ad");
            return;
        }
        this.z = j.a(w(), "KEY_ENABLE_ADD_MODE", 0);
        this.d = this.o.b;
        if (s()) {
            this.d = j.a(w(), "mediaType", this.d);
            this.H = intent.getParcelableArrayListExtra("PreSelectedImageList");
            return;
        }
        this.H = c.a(intent);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a64539b62fc91bd4ef007afffbd01437", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a64539b62fc91bd4ef007afffbd01437") : layoutInflater.inflate(R.layout.wm_ugc_media_ability_album_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void b(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95e896c8e1adb84398f10550c28fa2f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95e896c8e1adb84398f10550c28fa2f3");
            return;
        }
        this.F = Picasso.g(A());
        this.G = new com.sankuai.waimai.ugc.creator.ability.album.utils.a(A());
        this.c = new FlowLineActionBarBlock(1);
        a(R.id.fl_album_actionbar_container, (int) this.c);
        this.c.a(R.string.wm_ugc_media_picker_all_video_image);
        this.c.k = this;
        this.C = (TextView) b(R.id.wm_ugc_media_picker_tips);
        this.C.setText(this.o.i);
        this.B = b(R.id.pop_mask);
        this.D = b(R.id.wm_ugc_media_empty_view);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5aca26b4a65557ff5e5ea00cf2e7512f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5aca26b4a65557ff5e5ea00cf2e7512f");
        } else {
            this.A = new AlbumDirectoryListPopup(B());
            this.A.c = new AlbumDirectoryListPopup.a() { // from class: com.sankuai.waimai.ugc.creator.ability.album.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.ability.album.directory.AlbumDirectoryListPopup.a
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a43e414c85f24d76750fdbe7a18a45e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a43e414c85f24d76750fdbe7a18a45e4");
                        return;
                    }
                    p.b(a.this.A);
                    a.a(a.this, i);
                }
            };
            this.A.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.sankuai.waimai.ugc.creator.ability.album.a.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "20274fd46daa16c42c215388a5dee3ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "20274fd46daa16c42c215388a5dee3ae");
                        return;
                    }
                    a.this.c.d();
                    com.sankuai.waimai.ugc.creator.utils.a.a(a.this.B, 200L);
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2eedacee2089f23f6f448179921a9cab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2eedacee2089f23f6f448179921a9cab");
            return;
        }
        RecyclerView recyclerView = (RecyclerView) b(R.id.wm_ugc_media_rv);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);
        staggeredGridLayoutManager.setGapStrategy(2);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setItemAnimator(new v());
        this.E = new b(A(), this.F);
        recyclerView.setAdapter(this.E);
        this.E.b = new com.sankuai.waimai.ugc.creator.ability.album.event.a() { // from class: com.sankuai.waimai.ugc.creator.ability.album.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.ability.album.event.a
            public final void a(int i) {
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b9e0afbec3b7d0251d3180c72e3d4ab0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b9e0afbec3b7d0251d3180c72e3d4ab0");
                    return;
                }
                a aVar = a.this;
                Object[] objArr5 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "28323f887d14ea6071c7ac3240c54650", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "28323f887d14ea6071c7ac3240c54650");
                    return;
                }
                aVar.b = MediaPreviewDialogFragment.a(i);
                aVar.b.a(aVar.D());
            }

            @Override // com.sankuai.waimai.ugc.creator.ability.album.event.a
            public final void b(int i) {
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4a095e08aea4f4921d98a4ff2a7bf49e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4a095e08aea4f4921d98a4ff2a7bf49e");
                } else {
                    a.this.b("视频和图片不能同时添加");
                }
            }

            @Override // com.sankuai.waimai.ugc.creator.ability.album.event.a
            public final void a(int i, VideoData videoData) {
                Object[] objArr4 = {Integer.valueOf(i), videoData};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8a81dc18cd8a8e18808ed69912d8d6f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8a81dc18cd8a8e18808ed69912d8d6f9");
                    return;
                }
                a aVar = a.this;
                Object[] objArr5 = {videoData};
                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "81f9c36ead23547fe6f02521a649b27b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "81f9c36ead23547fe6f02521a649b27b");
                    return;
                }
                aVar.u();
                com.sankuai.waimai.ugc.creator.utils.task.b.a((com.sankuai.waimai.ugc.creator.utils.task.a) new com.sankuai.waimai.ugc.creator.task.b(aVar.B(), videoData.i, null) { // from class: com.sankuai.waimai.ugc.creator.ability.album.a.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.ugc.creator.utils.task.a
                    public final /* synthetic */ void a(VideoData videoData2) {
                        VideoData videoData3 = videoData2;
                        Object[] objArr6 = {videoData3};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b72b1fd71ad5b9b27b8b5951d0d4a976", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b72b1fd71ad5b9b27b8b5951d0d4a976");
                            return;
                        }
                        a.this.v();
                        if (a.this.o.d) {
                            a.this.d(videoData3);
                        } else if (a.this.o.f) {
                            a.this.a(videoData3, 0L, videoData3.b);
                        } else {
                            a.this.a(videoData3);
                        }
                    }
                });
            }

            @Override // com.sankuai.waimai.ugc.creator.ability.album.event.a
            public final void b(int i, VideoData videoData) {
                Object[] objArr4 = {Integer.valueOf(i), videoData};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e081c6c0fba9be81b50fc0d9b3416530", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e081c6c0fba9be81b50fc0d9b3416530");
                } else if (a.this.d != 1 && (a.this.d != 0 || a.this.e() <= 0)) {
                    if (m.a(videoData.b, a.this.o.k)) {
                        String a2 = m.a(a.this.o.k);
                        a aVar = a.this;
                        aVar.b("抱歉，无法添加短于" + a2 + "的视频");
                    } else if (m.b(videoData.b, a.this.o.l)) {
                        String a3 = m.a(a.this.o.l);
                        a aVar2 = a.this;
                        aVar2.b("抱歉，无法添加长于" + a3 + "的视频");
                    } else if (o.c(videoData.c)) {
                        n.a("当前选中视频是杜比视频");
                        a.this.b("抱歉，暂不支持杜比音效视频");
                    }
                } else {
                    a.this.b("视频和图片不能同时添加");
                }
            }

            @Override // com.sankuai.waimai.ugc.creator.ability.album.event.a
            public final void a(final List<ImageData> list) {
                Object[] objArr4 = {list};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ca6cfbab3018e86be31b0a53a58729fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ca6cfbab3018e86be31b0a53a58729fa");
                    return;
                }
                a.this.b(com.sankuai.waimai.ugc.creator.handler.c.class).a(new com.sankuai.waimai.ugc.creator.framework.event.c<com.sankuai.waimai.ugc.creator.handler.c>() { // from class: com.sankuai.waimai.ugc.creator.ability.album.a.3.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.ugc.creator.framework.event.c
                    public final /* synthetic */ void a(com.sankuai.waimai.ugc.creator.handler.c cVar) {
                        com.sankuai.waimai.ugc.creator.handler.c cVar2 = cVar;
                        Object[] objArr5 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3f62c24af4df0f8e1e8c22e506d3b9e9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3f62c24af4df0f8e1e8c22e506d3b9e9");
                        } else {
                            cVar2.a(list);
                        }
                    }
                });
                a.i(a.this);
            }
        };
        recyclerView.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.ugc.creator.ability.album.a.4
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                Object[] objArr4 = {recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9c0a92f7b4a3b557183f1b59d982f2aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9c0a92f7b4a3b557183f1b59d982f2aa");
                    return;
                }
                super.onScrolled(recyclerView2, i, i2);
                if (Math.abs(i2) > 30) {
                    Picasso unused = a.this.F;
                    Picasso unused2 = a.this.F;
                    return;
                }
                a.k(a.this);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                Object[] objArr4 = {recyclerView2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "716682ef2bbacba911274fd0e9a12692", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "716682ef2bbacba911274fd0e9a12692");
                } else if (i == 0) {
                    a.k(a.this);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String[] c() {
        return this.j;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824c009f20b46a85813a9758129681a1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824c009f20b46a85813a9758129681a1") : B().getString(R.string.wm_ugc_media_permission_request_rationale_for_album, new Object[]{str});
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb7bc24e4b4ef2d52236447436ae9aa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb7bc24e4b4ef2d52236447436ae9aa2");
            return;
        }
        int i = this.d;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26625ce62454dc760ffe2838527e1a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26625ce62454dc760ffe2838527e1a79");
        } else if (o.a(B())) {
            p.b(this.A);
            u();
            com.sankuai.waimai.ugc.creator.ability.album.utils.a aVar = this.G;
            aVar.e = i;
            com.sankuai.waimai.ugc.creator.ability.album.utils.a a2 = aVar.a(this.o.k, this.o.l);
            a2.h = new a.InterfaceC1360a() { // from class: com.sankuai.waimai.ugc.creator.ability.album.a.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.ability.album.utils.a.InterfaceC1360a
                public final void a(int i2, List<com.sankuai.waimai.ugc.creator.entity.inner.a> list) {
                    Object[] objArr3 = {Integer.valueOf(i2), list};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1b9f6ee6e558bd717c5945dae08ad57e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1b9f6ee6e558bd717c5945dae08ad57e");
                    } else if (o.a(a.this.B())) {
                        if (a.this.G.b()) {
                            a.this.D.setVisibility(0);
                            a.this.c.a(false);
                            a.this.c.a(R.string.wm_ugc_media_picker_all_video_image);
                            b bVar = a.this.E;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = b.a;
                            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "b60dcf68d16d89ad6f289089c4fa2165", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "b60dcf68d16d89ad6f289089c4fa2165");
                            } else {
                                bVar.c.clear();
                                bVar.d.clear();
                                bVar.f.clear();
                                bVar.e.clear();
                                bVar.g.clear();
                                bVar.notifyDataSetChanged();
                            }
                        } else {
                            a.this.D.setVisibility(8);
                            a.this.c.a(true);
                            a.this.E.a(a.this.G.d, a.this.H);
                            a.a(a.this, 0);
                        }
                        a.this.m();
                        a.i(a.this);
                        a.this.v();
                    }
                }
            };
            a2.a();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.handler.e
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc8e3375eabe698fd9d81c8daaa43d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc8e3375eabe698fd9d81c8daaa43d1")).intValue() : this.E.a();
    }

    @Override // com.sankuai.waimai.ugc.creator.handler.e
    public final int a(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8206ce44f1c2e7bce3173f2cb76bf21e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8206ce44f1c2e7bce3173f2cb76bf21e")).intValue() : this.E.b(imageData);
    }

    @Override // com.sankuai.waimai.ugc.creator.handler.e
    public final void b(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b732a112cf8099074d3c6383e134d048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b732a112cf8099074d3c6383e134d048");
        } else {
            this.E.a(imageData);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.handler.e
    public final List<ImageData> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b390517cacf7bd6088ab4d60f6bd51ad", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b390517cacf7bd6088ab4d60f6bd51ad") : this.E.h;
    }

    @Override // com.sankuai.waimai.ugc.creator.handler.e
    public final List<ImageData> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f767a33de5ec7bead275ef97e3aef412", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f767a33de5ec7bead275ef97e3aef412") : this.E.f;
    }

    @Override // com.sankuai.waimai.ugc.creator.handler.e
    public final SparseIntArray h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a49526eb1b1f07ce9278dbddc95cb9", RobustBitConfig.DEFAULT_VALUE) ? (SparseIntArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a49526eb1b1f07ce9278dbddc95cb9") : this.E.i;
    }

    @Override // com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.b
    public final void i() {
        g.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27c55342ebde68abced1c133b6842b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27c55342ebde68abced1c133b6842b5");
            return;
        }
        String generatePageInfoKey = AppUtil.generatePageInfoKey(B());
        Object[] objArr2 = {"b_waimai_03navt72_mc", "c_waimai_3el2732x", generatePageInfoKey};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d37e3d49bbcb26b4137db3e6dc0a63df", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (g.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d37e3d49bbcb26b4137db3e6dc0a63df");
        } else {
            a2 = new g.a(EventName.CLICK, "b_waimai_03navt72_mc").a("c_waimai_3el2732x");
            a2.b = generatePageInfoKey;
        }
        a2.a();
        if (this.G.b()) {
            return;
        }
        AlbumDirectoryListPopup albumDirectoryListPopup = this.A;
        List<com.sankuai.waimai.ugc.creator.entity.inner.a> list = this.G.d;
        Object[] objArr3 = {list};
        ChangeQuickRedirect changeQuickRedirect3 = AlbumDirectoryListPopup.a;
        if (PatchProxy.isSupport(objArr3, albumDirectoryListPopup, changeQuickRedirect3, false, "416f2726e73dbd99b0cc3911a5a2d685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, albumDirectoryListPopup, changeQuickRedirect3, false, "416f2726e73dbd99b0cc3911a5a2d685");
        } else {
            albumDirectoryListPopup.setHeight((int) (com.sankuai.waimai.foundation.utils.g.a(albumDirectoryListPopup.b, 78.0f) * 6.5f));
            View inflate = LayoutInflater.from(albumDirectoryListPopup.b).inflate(R.layout.wm_ugc_media_picker_popup_directory, (ViewGroup) null);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.pop_list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(albumDirectoryListPopup.b);
            linearLayoutManager.setAutoMeasureEnabled(true);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(new com.sankuai.waimai.ugc.creator.ability.album.directory.a(list, albumDirectoryListPopup.c));
            albumDirectoryListPopup.setContentView(inflate);
        }
        this.A.showAsDropDown(this.C, 0, com.sankuai.waimai.foundation.utils.g.a(A(), 2.0f), 80);
        View view = this.B;
        Object[] objArr4 = {view, 200L};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ugc.creator.utils.a.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "38af59ca0d358e7d3f77ace895032aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "38af59ca0d358e7d3f77ace895032aa6");
        } else if (view != null) {
            Object[] objArr5 = {view, Float.valueOf(0.0f), Float.valueOf(1.0f), new Long(200L)};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.ugc.creator.utils.a.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "c8ec01778bf5e9ae5f23b23d33d90bf7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "c8ec01778bf5e9ae5f23b23d33d90bf7");
            } else if (view != null && view.getVisibility() != 0) {
                view.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(200L);
                view.startAnimation(alphaAnimation);
            }
            view.setEnabled(true);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.b
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f695cddcd9f82b57b21caadfa2f267e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f695cddcd9f82b57b21caadfa2f267e");
        } else {
            p.b(this.A);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb169d1602b2f8fe0e77cada7afbcb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb169d1602b2f8fe0e77cada7afbcb9");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        ArrayList<ImageData> arrayList = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fca3caec5aefa7e3180aacedd09347a2", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fca3caec5aefa7e3180aacedd09347a2") : this.E.d;
        if (com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
            return;
        }
        if (this.z == 1) {
            a(arrayList, 0, this.E.b());
        } else if (this.o.g) {
            a(arrayList, this.E.b());
        } else {
            a(arrayList);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d756678b495a4698ac9579a649fa0b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d756678b495a4698ac9579a649fa0b7");
        } else if (m()) {
            r();
        }
    }

    public final boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a92fca76899f49e6dd4d360e5e9e652", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a92fca76899f49e6dd4d360e5e9e652")).booleanValue();
        }
        if (this.b == null || !this.b.b()) {
            return true;
        }
        this.b.dismiss();
        return false;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66951c6bdcfa1223e07527c36f6d6f48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66951c6bdcfa1223e07527c36f6d6f48");
            return;
        }
        super.b();
        if (this.G != null) {
            this.G.c();
        }
    }
}
