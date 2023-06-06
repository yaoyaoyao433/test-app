package com.sankuai.waimai.ugc.creator.ability.videofilter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.c;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock;
import com.sankuai.waimai.ugc.creator.component.a;
import com.sankuai.waimai.ugc.creator.component.g;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.manager.h;
import com.sankuai.waimai.ugc.creator.utils.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.ugc.creator.base.a implements b, com.sankuai.waimai.ugc.creator.manager.d {
    public static ChangeQuickRedirect a;
    private TextView A;
    private VideoData B;
    private long C;
    private long D;
    private final int b;
    private FlowLineActionBarBlock c;
    private g d;
    private com.sankuai.waimai.ugc.creator.component.a z;

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void j() {
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f056fa4121ef459ee27ca36183eea867", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f056fa4121ef459ee27ca36183eea867");
            return;
        }
        this.b = 100;
        this.C = 0L;
        this.D = 0L;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc50bc48ae819dad713397293aeeb21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc50bc48ae819dad713397293aeeb21");
            return;
        }
        this.B = (VideoData) intent.getParcelableExtra("input_media_data");
        this.C = f.a(intent, "clipStartTime", 0L);
        this.D = f.a(intent, "clipEndTime", 0L);
        this.C = Math.min(this.C, this.B.b);
        this.D = Math.min(this.D, this.B.b);
        if (this.D <= this.C) {
            this.C = 0L;
            this.D = this.B.b;
        }
        a("input_media_data", this.B);
        a("clipStartTime", Long.valueOf(this.C));
        a("clipEndTime", Long.valueOf(this.D));
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5954d45499526ddb9c89a7bb2eec07d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5954d45499526ddb9c89a7bb2eec07d") : layoutInflater.inflate(R.layout.wm_ugc_media_ability_video_filter_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String[] c() {
        return this.i;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void bK_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c195ba1c0b8d11ed8e1cb5685fb6347f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c195ba1c0b8d11ed8e1cb5685fb6347f");
            return;
        }
        h.a().a(A(), this.l);
        this.A = (TextView) b(R.id.tv_video_preview_tip);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69ebcfb34a887ba405e643a5f725c976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69ebcfb34a887ba405e643a5f725c976");
        } else {
            n.a("initChildBlocks");
            this.c = new FlowLineActionBarBlock(0);
            a(R.id.fl_video_filter_actionbar_container, (int) this.c);
            this.d = new g(com.sankuai.waimai.foundation.utils.g.a(A()) - com.sankuai.waimai.foundation.utils.g.a(A(), 32.0f), (com.sankuai.waimai.foundation.utils.g.b(A()) - com.sankuai.waimai.foundation.utils.g.a(A(), 201.0f)) - com.sankuai.waimai.foundation.utils.g.e(A()));
            a(R.id.fl_video_filter_preview_container, (int) this.d);
            this.z = new com.sankuai.waimai.ugc.creator.component.a();
            a(R.id.fl_video_filter_selector_container, (int) this.z);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3b63a67b629209dbf7a84fb7dbe18e7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3b63a67b629209dbf7a84fb7dbe18e7a");
        } else {
            n.a("fetchFiltersData");
            final List<com.sankuai.waimai.ugc.creator.entity.inner.c> list = new e().b;
            int a2 = com.sankuai.waimai.foundation.utils.g.a(B(), 54.0f);
            final h a3 = h.a();
            long j = this.C;
            final com.sankuai.waimai.ugc.creator.manager.e eVar = new com.sankuai.waimai.ugc.creator.manager.e() { // from class: com.sankuai.waimai.ugc.creator.ability.videofilter.d.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.manager.e
                public final void a(int i, long j2, Bitmap bitmap) {
                    Object[] objArr4 = {Integer.valueOf(i), new Long(j2), bitmap};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "df2d845ee5efc886c2a6dcd6cc742315", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "df2d845ee5efc886c2a6dcd6cc742315");
                        return;
                    }
                    n.a("fetchFiltersData->getThumbnail->run");
                    com.sankuai.waimai.ugc.creator.component.a aVar = d.this.z;
                    List list2 = list;
                    Object[] objArr5 = {list2, bitmap};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.ugc.creator.component.a.a;
                    if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "9d143fcb63d9369a33a015b5a9561731", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "9d143fcb63d9369a33a015b5a9561731");
                    } else if (com.sankuai.waimai.foundation.utils.b.b(list2)) {
                    } else {
                        a.b bVar = aVar.b;
                        Object[] objArr6 = {list2, bitmap};
                        ChangeQuickRedirect changeQuickRedirect6 = a.b.a;
                        if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "2b4cc4913fb230ab3c88418d32c62944", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "2b4cc4913fb230ab3c88418d32c62944");
                        } else if (!com.sankuai.waimai.foundation.utils.b.b(list2)) {
                            bVar.e = bitmap;
                            bVar.b.clear();
                            bVar.b.addAll(list2);
                            bVar.a((com.sankuai.waimai.ugc.creator.entity.inner.c) list2.get(0), 0);
                        } else {
                            bVar.c = null;
                            bVar.d = -1;
                        }
                    }
                }
            };
            Object[] objArr4 = {new Long(j), Integer.valueOf(a2), Integer.valueOf(a2), eVar};
            ChangeQuickRedirect changeQuickRedirect4 = h.a;
            if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "6cfaec9e5aa6931cee89ec0b88e5515f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "6cfaec9e5aa6931cee89ec0b88e5515f");
            } else if (a3.b != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(j));
                a3.b.a((List<Long>) arrayList, a2, a2, true, new c.a() { // from class: com.sankuai.waimai.ugc.creator.manager.h.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c.a
                    public final void a(final int i, final long j2, final Bitmap bitmap) {
                        Object[] objArr5 = {Integer.valueOf(i), new Long(j2), bitmap};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b2aaa65bd786d6681501d8b4f86c9b29", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b2aaa65bd786d6681501d8b4f86c9b29");
                        } else {
                            com.sankuai.waimai.ugc.creator.utils.task.b.b(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.manager.h.2.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ec66a4065a0bf35e3e7628d86441b4b3", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ec66a4065a0bf35e3e7628d86441b4b3");
                                    } else if (eVar != null) {
                                        eVar.a(i, j2, bitmap);
                                    }
                                }
                            });
                        }
                    }
                });
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a82833359461c6110eb30cc24ca223e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a82833359461c6110eb30cc24ca223e7");
            return;
        }
        View b = b(R.id.gesture_detector_view);
        final GestureDetector gestureDetector = new GestureDetector(A(), new GestureDetector.OnGestureListener() { // from class: com.sankuai.waimai.ugc.creator.ability.videofilter.d.2
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr6 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "50b5c5d41b72e4d892143aae9ebc3253", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "50b5c5d41b72e4d892143aae9ebc3253")).booleanValue();
                }
                if (motionEvent.getX() - motionEvent2.getX() > 100.0f) {
                    ((a) d.this.a(a.class)).bP_();
                    return true;
                } else if (motionEvent2.getX() - motionEvent.getX() > 100.0f) {
                    ((a) d.this.a(a.class)).bO_();
                    return true;
                } else {
                    return false;
                }
            }
        });
        b.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.ugc.creator.ability.videofilter.d.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr6 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "704d848432687c8827538df73281f524", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "704d848432687c8827538df73281f524")).booleanValue();
                }
                gestureDetector.onTouchEvent(motionEvent);
                return true;
            }
        });
    }

    @Override // com.sankuai.waimai.ugc.creator.ability.videofilter.b
    public final void a(com.sankuai.waimai.ugc.creator.entity.inner.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7010a8726c460742be31c993d7611a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7010a8726c460742be31c993d7611a4");
            return;
        }
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfd112f9e91cc802faffb3a3b271e606", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfd112f9e91cc802faffb3a3b271e606");
        } else if (TextUtils.equals("R0", cVar.b)) {
            this.A.setVisibility(8);
        } else {
            this.A.setText(cVar.c);
            this.A.setVisibility(0);
            com.sankuai.waimai.ugc.creator.utils.a.a(this.A, PayTask.j);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe836406f5e9d59dc3cc9b7f8567a2fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe836406f5e9d59dc3cc9b7f8567a2fa");
        } else if (h.a().d) {
        } else {
            n.a("onBackPressed");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "337d77d950ddf80680412ee6d242e4a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "337d77d950ddf80680412ee6d242e4a5");
                return;
            }
            n.a("backTip");
            if (TextUtils.equals("R0", this.z.d())) {
                B().finish();
                n.a("backTip->finish");
                return;
            }
            new RooAlertDialog.a(new ContextThemeWrapper(A(), 2131558962)).b(R.string.wm_ugc_video_edit_back_message).a(R.string.wm_ugc_video_edit_back_cancel, (DialogInterface.OnClickListener) null).b(R.string.wm_ugc_video_edit_back_approve, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.videofilter.d.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f5d4ec001cedc20502367021f07b3cb2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f5d4ec001cedc20502367021f07b3cb2");
                    } else {
                        d.this.r();
                    }
                }
            }).b();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d6563bde8e9607797791a0d51c7c3c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d6563bde8e9607797791a0d51c7c3c3");
            return;
        }
        com.sankuai.waimai.ugc.creator.judas.e a2 = com.sankuai.waimai.ugc.creator.judas.e.a();
        String d = this.z.d();
        Activity B = B();
        Object[] objArr2 = {d, B};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ugc.creator.judas.e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "f6f215e4211355fb25e648c43f0e051e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "f6f215e4211355fb25e648c43f0e051e");
        } else if (a2.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("video_filters", d);
            a2.a(a2.b.y, a2.b.f, hashMap, B);
        }
        h.a().b(this.C, this.D);
        h.a().a(A(), this.o.t, this);
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce941f0d73864f452ffff45ac41411c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce941f0d73864f452ffff45ac41411c4");
        } else {
            u();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "981888a6c4ad44d40947762edfd32bc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "981888a6c4ad44d40947762edfd32bc7");
        } else {
            v();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void a(VideoData videoData) {
        Object[] objArr = {videoData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73e8542009136c9d167378a52fa7574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73e8542009136c9d167378a52fa7574");
            return;
        }
        Object[] objArr2 = {videoData};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ugc.creator.base.a.e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdaf5ed0e3772f65a7134299ad82802e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdaf5ed0e3772f65a7134299ad82802e");
            return;
        }
        n.a("completeVideoProcedureOld");
        c(videoData);
        a(-1, super.a(videoData.h, videoData.r, videoData.t.h, videoData.t.r, videoData.l, videoData.m, videoData.b, videoData.n, true));
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37e79b63c22dc61347fa7f59cfb2dd23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37e79b63c22dc61347fa7f59cfb2dd23");
            return;
        }
        super.b();
        n.a("onDestroy");
        h.a().a(this.l);
    }
}
