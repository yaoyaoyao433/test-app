package com.sankuai.waimai.ugc.creator.widgets.clipper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.support.v4.widget.ViewDragHelper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VideoClipperView extends ConstraintLayout {
    public static ChangeQuickRedirect g;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private ViewDragHelper G;
    private a H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private final RecyclerView.k R;
    public com.sankuai.waimai.ugc.creator.widgets.clipper.a h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    private String n;
    private RecyclerView o;
    private View p;
    private View q;
    private ImageView r;
    private ImageView s;
    private View t;
    private View u;
    private int v;
    private double w;
    private double x;
    private int y;
    private int z;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void a(int i, int i2);

        void a(int i, int i2, int i3);

        void b();

        void b(int i, int i2, int i3);
    }

    public static /* synthetic */ void a(VideoClipperView videoClipperView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, videoClipperView, changeQuickRedirect, false, "e46f7c9e9f022b40774470fa234f5886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, videoClipperView, changeQuickRedirect, false, "e46f7c9e9f022b40774470fa234f5886");
        } else if (videoClipperView.H != null) {
            if (i == 1) {
                videoClipperView.H.a();
            } else if (i == 0) {
                videoClipperView.H.a(videoClipperView.O, videoClipperView.P);
            }
        }
    }

    public static /* synthetic */ void b(VideoClipperView videoClipperView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, videoClipperView, changeQuickRedirect, false, "06e452388ba10e33baaba4d668696a86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, videoClipperView, changeQuickRedirect, false, "06e452388ba10e33baaba4d668696a86");
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) videoClipperView.r.getLayoutParams();
        aVar.leftMargin = i;
        videoClipperView.I = i;
        videoClipperView.r.setLayoutParams(aVar);
    }

    public static /* synthetic */ void c(VideoClipperView videoClipperView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, videoClipperView, changeQuickRedirect, false, "bce18b0d41b218436843bed7cce14e3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, videoClipperView, changeQuickRedirect, false, "bce18b0d41b218436843bed7cce14e3f");
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) videoClipperView.s.getLayoutParams();
        int width = (videoClipperView.getWidth() - i) - videoClipperView.C;
        aVar.rightMargin = width;
        videoClipperView.J = width;
        videoClipperView.s.setLayoutParams(aVar);
    }

    public static /* synthetic */ int g(VideoClipperView videoClipperView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, videoClipperView, changeQuickRedirect, false, "32cf58fe14bc5ca198b4b51579fe3257", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, videoClipperView, changeQuickRedirect, false, "32cf58fe14bc5ca198b4b51579fe3257")).intValue() : Math.min(Math.max(i, 0), (videoClipperView.s.getLeft() - videoClipperView.C) - videoClipperView.z);
    }

    public static /* synthetic */ int h(VideoClipperView videoClipperView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, videoClipperView, changeQuickRedirect, false, "0a1e08639d90bcff21d5775a6fd25dbc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, videoClipperView, changeQuickRedirect, false, "0a1e08639d90bcff21d5775a6fd25dbc")).intValue();
        }
        return Math.min(Math.max(i, videoClipperView.r.getRight() + videoClipperView.z), videoClipperView.getWidth() - videoClipperView.C);
    }

    public static /* synthetic */ void o(VideoClipperView videoClipperView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, videoClipperView, changeQuickRedirect, false, "6081553b3de03c3e3d0fa1e4382d0926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, videoClipperView, changeQuickRedirect, false, "6081553b3de03c3e3d0fa1e4382d0926");
        } else if (videoClipperView.H != null) {
            videoClipperView.H.b(videoClipperView.O, videoClipperView.P, videoClipperView.m);
        }
    }

    public static /* synthetic */ void p(VideoClipperView videoClipperView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, videoClipperView, changeQuickRedirect, false, "8ea9f776442d3a327fbfdac47e331ab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, videoClipperView, changeQuickRedirect, false, "8ea9f776442d3a327fbfdac47e331ab4");
            return;
        }
        videoClipperView.y = videoClipperView.getWidth() - (videoClipperView.C * 2);
        videoClipperView.w = (videoClipperView.getHeight() * 9.0d) / 16.0d;
        videoClipperView.A = videoClipperView.getHeight();
        videoClipperView.x = (videoClipperView.k * 1.0d) / videoClipperView.y;
        videoClipperView.z = Double.valueOf(Math.ceil(videoClipperView.l / videoClipperView.x)).intValue();
        videoClipperView.D = Double.valueOf(Math.ceil(videoClipperView.j / (videoClipperView.x * videoClipperView.w))).intValue();
        videoClipperView.B = (int) Math.round(((videoClipperView.j * 1.0d) / videoClipperView.D) / videoClipperView.x);
        videoClipperView.h = new com.sankuai.waimai.ugc.creator.widgets.clipper.a(videoClipperView.B, videoClipperView.A);
        videoClipperView.o.setLayoutManager(new ThumbnailListLayoutManager(videoClipperView.getContext(), 0));
        videoClipperView.o.setAdapter(videoClipperView.h);
        videoClipperView.Q = true;
        if (videoClipperView.H != null) {
            videoClipperView.H.a(videoClipperView.B, videoClipperView.A, videoClipperView.D);
        }
    }

    public VideoClipperView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4347ad7fd667f4441fdbb7d0346c8c84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4347ad7fd667f4441fdbb7d0346c8c84");
            return;
        }
        this.n = "VideoClipperView";
        this.v = 12;
        this.i = 60000;
        this.l = 3000;
        this.C = 48;
        this.E = 10;
        this.Q = false;
        this.R = new RecyclerView.k() { // from class: com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.4
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27a3fcb15e15475fd21e3909671cdde7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27a3fcb15e15475fd21e3909671cdde7");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                VideoClipperView.a(VideoClipperView.this, i);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f9c005127bd5a658d7e469e97f5be6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f9c005127bd5a658d7e469e97f5be6c");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                VideoClipperView.this.M = VideoClipperView.this.getScrollXDistance();
                VideoClipperView.this.L = Double.valueOf(Math.ceil(VideoClipperView.this.x * VideoClipperView.this.M)).intValue();
                VideoClipperView.this.b();
                VideoClipperView.o(VideoClipperView.this);
            }
        };
        a(context, (AttributeSet) null);
    }

    public VideoClipperView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00881d870c359b72af73ab3e1fe15ec9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00881d870c359b72af73ab3e1fe15ec9");
            return;
        }
        this.n = "VideoClipperView";
        this.v = 12;
        this.i = 60000;
        this.l = 3000;
        this.C = 48;
        this.E = 10;
        this.Q = false;
        this.R = new RecyclerView.k() { // from class: com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.4
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27a3fcb15e15475fd21e3909671cdde7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27a3fcb15e15475fd21e3909671cdde7");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                VideoClipperView.a(VideoClipperView.this, i);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f9c005127bd5a658d7e469e97f5be6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f9c005127bd5a658d7e469e97f5be6c");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                VideoClipperView.this.M = VideoClipperView.this.getScrollXDistance();
                VideoClipperView.this.L = Double.valueOf(Math.ceil(VideoClipperView.this.x * VideoClipperView.this.M)).intValue();
                VideoClipperView.this.b();
                VideoClipperView.o(VideoClipperView.this);
            }
        };
        a(context, attributeSet);
    }

    public VideoClipperView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a11d1abf8572a4fba0c0f67585cf912", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a11d1abf8572a4fba0c0f67585cf912");
            return;
        }
        this.n = "VideoClipperView";
        this.v = 12;
        this.i = 60000;
        this.l = 3000;
        this.C = 48;
        this.E = 10;
        this.Q = false;
        this.R = new RecyclerView.k() { // from class: com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.4
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27a3fcb15e15475fd21e3909671cdde7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27a3fcb15e15475fd21e3909671cdde7");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                VideoClipperView.a(VideoClipperView.this, i2);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i22) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i22)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f9c005127bd5a658d7e469e97f5be6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f9c005127bd5a658d7e469e97f5be6c");
                    return;
                }
                super.onScrolled(recyclerView, i2, i22);
                VideoClipperView.this.M = VideoClipperView.this.getScrollXDistance();
                VideoClipperView.this.L = Double.valueOf(Math.ceil(VideoClipperView.this.x * VideoClipperView.this.M)).intValue();
                VideoClipperView.this.b();
                VideoClipperView.o(VideoClipperView.this);
            }
        };
        a(context, attributeSet);
    }

    private void a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59452722563841ce956c98040b59e121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59452722563841ce956c98040b59e121");
            return;
        }
        b(context, attributeSet);
        a(context);
        b(context);
    }

    private void b(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b844fb1ac63d8d89b275ee9fb85d553", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b844fb1ac63d8d89b275ee9fb85d553");
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.slideThumbWidth}, 0, 0);
            this.C = obtainStyledAttributes.getDimensionPixelSize(0, 48);
            obtainStyledAttributes.recycle();
        }
        this.F = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e748ddc11e2cef08dd7adf521379fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e748ddc11e2cef08dd7adf521379fb");
            return;
        }
        int id = getId();
        if (id < 0) {
            setId(R.id.video_clipper_root_layout);
            id = R.id.video_clipper_root_layout;
        }
        this.o = new RecyclerView(context);
        this.o.setId(R.id.video_clipper_thumbnail_list);
        ConstraintLayout.a aVar = new ConstraintLayout.a(0, -1);
        aVar.d = id;
        aVar.leftMargin = this.C;
        aVar.rightMargin = this.C;
        aVar.g = id;
        this.o.setLayoutParams(aVar);
        this.o.setOutlineProvider(new ViewOutlineProvider() { // from class: com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                Object[] objArr2 = {view, outline};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09c4439d0c01f6aab83aa5101d38fa91", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09c4439d0c01f6aab83aa5101d38fa91");
                } else {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), VideoClipperView.this.v);
                }
            }
        });
        this.o.setClipToOutline(true);
        this.o.addOnScrollListener(this.R);
        this.p = new View(context);
        this.p.setBackgroundColor(1713513510);
        this.p.setId(R.id.video_clipper_left_mask);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a(0, -1);
        aVar2.d = R.id.video_clipper_thumbnail_list;
        aVar2.g = R.id.video_clipper_left_slide_thumb;
        this.p.setLayoutParams(aVar2);
        this.q = new View(context);
        this.q.setId(R.id.video_clipper_right_mask);
        this.q.setBackgroundColor(1713513510);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a(0, -1);
        aVar3.g = R.id.video_clipper_thumbnail_list;
        aVar3.d = R.id.video_clipper_right_slide_thumb;
        this.q.setLayoutParams(aVar3);
        this.r = new ImageView(context);
        this.r.setScaleType(ImageView.ScaleType.FIT_XY);
        this.r.setImageResource(R.drawable.icon_slide_left);
        this.r.setId(R.id.video_clipper_left_slide_thumb);
        ConstraintLayout.a aVar4 = new ConstraintLayout.a(this.C, -1);
        aVar4.d = id;
        this.r.setLayoutParams(aVar4);
        this.s = new ImageView(context);
        this.s.setScaleType(ImageView.ScaleType.FIT_XY);
        this.s.setImageResource(R.drawable.icon_slide_right);
        this.s.setId(R.id.video_clipper_right_slide_thumb);
        ConstraintLayout.a aVar5 = new ConstraintLayout.a(this.C, -1);
        aVar5.g = id;
        this.s.setLayoutParams(aVar5);
        this.t = new View(context);
        this.t.setBackgroundColor(-13261);
        this.t.setId(R.id.video_clipper_select_area_top_border);
        ConstraintLayout.a aVar6 = new ConstraintLayout.a(0, this.E);
        aVar6.e = R.id.video_clipper_left_slide_thumb;
        aVar6.f = R.id.video_clipper_right_slide_thumb;
        aVar6.h = id;
        this.t.setLayoutParams(aVar6);
        this.u = new View(context);
        this.u.setBackgroundColor(-13261);
        this.u.setId(R.id.video_clipper_select_area_bottom_border);
        ConstraintLayout.a aVar7 = new ConstraintLayout.a(0, this.E);
        aVar7.e = R.id.video_clipper_left_slide_thumb;
        aVar7.f = R.id.video_clipper_right_slide_thumb;
        aVar7.k = id;
        this.u.setLayoutParams(aVar7);
        addView(this.o);
        addView(this.p);
        addView(this.q);
        addView(this.r);
        addView(this.s);
        addView(this.t);
        addView(this.u);
    }

    private void b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd189442a534994d61305e3ddc52b8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd189442a534994d61305e3ddc52b8f7");
        } else {
            this.G = ViewDragHelper.create(this, 1.0f, new ViewDragHelper.Callback() { // from class: com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.2
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public boolean tryCaptureView(@NonNull View view, int i) {
                    Object[] objArr2 = {view, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d1c4fb464a25794a1dbd81a8809f884", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d1c4fb464a25794a1dbd81a8809f884")).booleanValue() : VideoClipperView.this.b(view);
                }

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public void onViewDragStateChanged(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff41b8596eeb5338fc017477d10561e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff41b8596eeb5338fc017477d10561e7");
                    } else {
                        VideoClipperView.a(VideoClipperView.this, i);
                    }
                }

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a4e2ff94228d29cb3ba2e7bae555863", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a4e2ff94228d29cb3ba2e7bae555863");
                        return;
                    }
                    if (view != VideoClipperView.this.r) {
                        if (view == VideoClipperView.this.s) {
                            VideoClipperView.c(VideoClipperView.this, i);
                        }
                    } else {
                        VideoClipperView.b(VideoClipperView.this, i);
                    }
                    VideoClipperView.this.N = VideoClipperView.this.t.getWidth();
                    if (VideoClipperView.this.I != 0 || VideoClipperView.this.J != 0) {
                        VideoClipperView.this.K = Double.valueOf(Math.ceil(VideoClipperView.this.I * VideoClipperView.this.x)).intValue();
                        VideoClipperView.this.m = Double.valueOf(Math.ceil(VideoClipperView.this.N * VideoClipperView.this.x)).intValue();
                    } else {
                        VideoClipperView.this.K = 0;
                        VideoClipperView.this.m = VideoClipperView.this.k;
                    }
                    if (VideoClipperView.j(VideoClipperView.this)) {
                        VideoClipperView.this.m = VideoClipperView.this.l;
                        if (VideoClipperView.this.H != null) {
                            VideoClipperView.this.H.b();
                        }
                    } else if (VideoClipperView.m(VideoClipperView.this)) {
                        VideoClipperView.this.m = VideoClipperView.this.k;
                        if (VideoClipperView.this.H != null) {
                            a unused = VideoClipperView.this.H;
                        }
                    }
                    VideoClipperView.this.b();
                    VideoClipperView.o(VideoClipperView.this);
                }

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
                    Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f40d33e22a1d58e7b31159c52d9b8b88", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f40d33e22a1d58e7b31159c52d9b8b88")).intValue();
                    }
                    if (view != VideoClipperView.this.r) {
                        if (view == VideoClipperView.this.s) {
                            return VideoClipperView.h(VideoClipperView.this, i);
                        }
                        return 0;
                    }
                    return VideoClipperView.g(VideoClipperView.this, i);
                }
            });
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f62d074a08648226fe5b3906fc5c28c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f62d074a08648226fe5b3906fc5c28c");
            return;
        }
        this.O = this.L + this.K;
        this.P = this.L + this.K + this.m;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d529771177a59da1ad3bfd1036f96e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d529771177a59da1ad3bfd1036f96e7")).booleanValue();
        }
        if (motionEvent.getAction() == 0 ? b(this.G.findTopChildUnder((int) motionEvent.getX(), (int) motionEvent.getY())) : false) {
            this.G.processTouchEvent(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        }
        return this.G.shouldInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        if (view != null) {
            return view == this.r || view == this.s;
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6aaeefa2dd595543375f7e00085c5d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6aaeefa2dd595543375f7e00085c5d6")).booleanValue();
        }
        this.G.processTouchEvent(motionEvent);
        return true;
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36acd8ef97f58748411224a09b502b43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36acd8ef97f58748411224a09b502b43");
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e09d89aeb71bb9ad6fd9baafc9e1508e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e09d89aeb71bb9ad6fd9baafc9e1508e");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public void setCallback(a aVar) {
        this.H = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScrollXDistance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731c8e464a042b9934392f8084de316f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731c8e464a042b9934392f8084de316f")).intValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.o.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition != null) {
            return (findFirstVisibleItemPosition * this.B) - findViewByPosition.getLeft();
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class ThumbnailListLayoutManager extends LinearLayoutManager {
        public static ChangeQuickRedirect a;

        public ThumbnailListLayoutManager(Context context, int i) {
            super(context, i, false);
            Object[] objArr = {VideoClipperView.this, context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489105c4d09d28e9a091e319093bbe92", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489105c4d09d28e9a091e319093bbe92");
            }
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean canScrollHorizontally() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6524088662f46435374ace382bc582b8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6524088662f46435374ace382bc582b8")).booleanValue() : VideoClipperView.this.j > VideoClipperView.this.k;
        }
    }

    public static /* synthetic */ boolean j(VideoClipperView videoClipperView) {
        return videoClipperView.N <= videoClipperView.z;
    }

    public static /* synthetic */ boolean m(VideoClipperView videoClipperView) {
        return videoClipperView.N >= videoClipperView.y;
    }
}
