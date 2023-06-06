package com.sankuai.xm.video;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.base.util.u;
import com.sankuai.xm.base.util.v;
import com.sankuai.xm.base.util.w;
import com.tencent.connect.share.QzonePublish;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RecordVideoActivity extends BaseActivity {
    public static ChangeQuickRedirect b;
    public View.OnTouchListener c;
    private SurfaceView d;
    private RelativeLayout e;
    private SimpleTextView f;
    private ProgressBar g;
    private TextView h;
    private ClipDrawable i;
    private ClipDrawable j;
    private TextView k;
    private com.sankuai.xm.recorder.d l;
    private int m;
    private boolean n;
    private String o;
    private boolean p;
    private long q;
    private int r;
    private com.sankuai.xm.recorder.c s;

    public RecordVideoActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "249f5912f50c05a89c96c1d99c6535e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "249f5912f50c05a89c96c1d99c6535e7");
            return;
        }
        this.m = 0;
        this.n = false;
        this.o = null;
        this.c = new View.OnTouchListener() { // from class: com.sankuai.xm.video.RecordVideoActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "487d0db846b28f8993359e298b85e038", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "487d0db846b28f8993359e298b85e038")).booleanValue();
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        RecordVideoActivity.this.p = false;
                        if (RecordVideoActivity.this.m == 1) {
                            RecordVideoActivity.this.c(2);
                            if (RecordVideoActivity.b(RecordVideoActivity.this)) {
                                RecordVideoActivity.this.l.a(RecordVideoActivity.this.o);
                                break;
                            }
                        }
                        break;
                    case 1:
                        RecordVideoActivity.this.p = true;
                        if (RecordVideoActivity.this.m == 4) {
                            RecordVideoActivity.this.l.b();
                            break;
                        } else if (RecordVideoActivity.this.m == 6 || RecordVideoActivity.this.m == 3) {
                            RecordVideoActivity.this.l.a();
                            break;
                        }
                        break;
                    case 2:
                        RecordVideoActivity.this.p = false;
                        if ((RecordVideoActivity.this.m != 4 && RecordVideoActivity.this.m != 3) || !RecordVideoActivity.a(RecordVideoActivity.this, motionEvent.getY())) {
                            if (RecordVideoActivity.this.m == 6 && !RecordVideoActivity.a(RecordVideoActivity.this, motionEvent.getY())) {
                                int currentTimeMillis = (int) (System.currentTimeMillis() - RecordVideoActivity.this.q);
                                if (RecordVideoActivity.this.m != 6 || currentTimeMillis > 1000) {
                                    if (RecordVideoActivity.this.m == 6 && currentTimeMillis > 1000) {
                                        RecordVideoActivity.this.c(4);
                                        break;
                                    }
                                } else {
                                    RecordVideoActivity.this.c(3);
                                    break;
                                }
                            }
                        } else {
                            RecordVideoActivity.this.c(6);
                            break;
                        }
                        break;
                    case 3:
                        RecordVideoActivity.this.p = true;
                        if (RecordVideoActivity.this.m == 4 || RecordVideoActivity.this.m == 3 || RecordVideoActivity.this.m == 6) {
                            RecordVideoActivity.this.l.a();
                            break;
                        }
                        break;
                }
                return true;
            }
        };
        this.r = 10000;
        this.s = new com.sankuai.xm.recorder.c() { // from class: com.sankuai.xm.video.RecordVideoActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.recorder.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fab03f769e74bd5427ea2f4e1143402", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fab03f769e74bd5427ea2f4e1143402");
                } else {
                    RecordVideoActivity.this.c(1);
                }
            }

            @Override // com.sankuai.xm.recorder.c
            public final void a(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca9d4a6c371729332a32f71162504788", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca9d4a6c371729332a32f71162504788");
                } else if (RecordVideoActivity.this.p) {
                    RecordVideoActivity.this.l.a();
                } else {
                    RecordVideoActivity.this.c(3);
                }
            }

            @Override // com.sankuai.xm.recorder.c
            public final void b(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2e01081e8210b22a488fd3e7d75988d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2e01081e8210b22a488fd3e7d75988d");
                    return;
                }
                RecordVideoActivity.this.c(1);
                if (RecordVideoActivity.this.p) {
                    return;
                }
                RecordVideoActivity.this.l.a(RecordVideoActivity.this.o);
            }

            @Override // com.sankuai.xm.recorder.c
            public final void a(String str, String str2, int i, int i2, short s, short s2, int i3, int i4) {
                Object[] objArr2 = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Short.valueOf(s), Short.valueOf(s2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4283e0328dc3bd0da6abd89bc5aaa5d3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4283e0328dc3bd0da6abd89bc5aaa5d3");
                    return;
                }
                RecordVideoActivity.this.c(5);
                c cVar = f.a().b;
                if (cVar != null) {
                    cVar.a(new VideoInfo(str, str2, i, i2, s, s2, i3, i4));
                }
                RecordVideoActivity.this.finish();
            }

            @Override // com.sankuai.xm.recorder.c
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "477b37505c143f312ed22e5a43a52b9c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "477b37505c143f312ed22e5a43a52b9c");
                    return;
                }
                RecordVideoActivity recordVideoActivity = RecordVideoActivity.this;
                switch (i) {
                    case 2:
                        RecordVideoActivity.this.c(7);
                        ad.a(recordVideoActivity, u.b(recordVideoActivity) ? R.string.xm_sdk_video_camera_init_error_toggle_off : R.string.xm_sdk_video_camera_init_error);
                        return;
                    case 3:
                        RecordVideoActivity.this.c(7);
                        ad.a(recordVideoActivity, u.a(recordVideoActivity) ? R.string.xm_sdk_video_mic_init_error_toggle_off : R.string.xm_sdk_video_mic_init_error);
                        return;
                    case 4:
                    default:
                        return;
                    case 5:
                        ad.a(recordVideoActivity, RecordVideoActivity.this.getString(R.string.xm_sdk_video_error_record));
                        RecordVideoActivity.this.c(1);
                        return;
                    case 6:
                        RecordVideoActivity.this.c(7);
                        ad.a(recordVideoActivity, RecordVideoActivity.this.getString(R.string.xm_sdk_video_record_short));
                        RecordVideoActivity.this.finish();
                        return;
                    case 7:
                        RecordVideoActivity.this.c(1);
                        ad.a(RecordVideoActivity.this, (int) R.string.xm_sdk_video_record_focus_lost);
                        return;
                }
            }
        };
    }

    public static /* synthetic */ boolean a(RecordVideoActivity recordVideoActivity, float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, recordVideoActivity, changeQuickRedirect, false, "d80b6ae3853e908429302b82e4a17fd3", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, recordVideoActivity, changeQuickRedirect, false, "d80b6ae3853e908429302b82e4a17fd3")).booleanValue() : f < ((float) (-(w.c(recordVideoActivity).y / 10)));
    }

    public static /* synthetic */ boolean b(RecordVideoActivity recordVideoActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, recordVideoActivity, changeQuickRedirect, false, "d2b934a0a80da5dcf20a26be141620bf", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, recordVideoActivity, changeQuickRedirect, false, "d2b934a0a80da5dcf20a26be141620bf")).booleanValue();
        }
        Object[] objArr2 = {recordVideoActivity, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = v.a;
        return (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2dac2ba0d956f7c026750fdc7a12588e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2dac2ba0d956f7c026750fdc7a12588e")).booleanValue() : v.a(recordVideoActivity, PermissionGuard.PERMISSION_CAMERA, "jcyf-e4b399808a333f25", true)) && v.a((Context) recordVideoActivity, true) && v.b(recordVideoActivity, true);
    }

    @Override // com.sankuai.xm.video.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5565a0d8f50896e12f15c4ad0f2f50d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5565a0d8f50896e12f15c4ad0f2f50d5");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.xm_sdk_activity_video_record);
        this.o = com.sankuai.waimai.platform.utils.f.a(getIntent(), QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH);
        this.i = new ClipDrawable(new ColorDrawable(getResources().getColor(R.color.videolib_main_color)), 17, 1);
        this.j = new ClipDrawable(new ColorDrawable(getResources().getColor(R.color.videolib_record_remind_cancel_bg)), 17, 1);
        this.d = (SurfaceView) findViewById(R.id.videolib_surface_record);
        this.f = (SimpleTextView) findViewById(R.id.btn_video_record);
        this.e = (RelativeLayout) findViewById(R.id.rl_video_record);
        this.h = (TextView) findViewById(R.id.videolib_tv_record_remind);
        this.k = (TextView) findViewById(R.id.videolib_tv_video_record_return);
        this.g = (ProgressBar) findViewById(R.id.progress_bar_record_video);
        this.f.setOnTouchListener(this.c);
        this.h.setVisibility(8);
        this.r = f.a().e;
        if (this.r <= 1000) {
            this.r = 10000;
        }
        this.g.setMax(this.r);
        this.g.setProgress(0);
        this.g.setProgressDrawable(this.i);
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.video.RecordVideoActivity.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f92b08c5f0457c69f617d2e07da030e1", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f92b08c5f0457c69f617d2e07da030e1");
                    return;
                }
                if (RecordVideoActivity.this.m == 4 || RecordVideoActivity.this.m == 3) {
                    RecordVideoActivity.this.l.a();
                }
                RecordVideoActivity.this.l.c();
                c cVar = f.a().b;
                if (cVar != null) {
                    cVar.a();
                }
                RecordVideoActivity.this.finish();
            }
        });
        this.d.setFocusable(true);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.video.RecordVideoActivity.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab1ced6f3fe57366fe36403c13fd8468", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab1ced6f3fe57366fe36403c13fd8468");
                    return;
                }
                final com.sankuai.xm.recorder.d dVar = RecordVideoActivity.this.l;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.recorder.d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "b21d8c61ee7a5d9590af60d8f8f1e157", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "b21d8c61ee7a5d9590af60d8f8f1e157");
                    return;
                }
                try {
                    dVar.g.a(new Camera.AutoFocusCallback() { // from class: com.sankuai.xm.recorder.d.7
                        public static ChangeQuickRedirect a;

                        @Override // android.hardware.Camera.AutoFocusCallback
                        public final void onAutoFocus(boolean z, Camera camera) {
                            Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), camera};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6e7132d474df202687c9d7b680d62205", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6e7132d474df202687c9d7b680d62205");
                            } else if (z) {
                                d.a(dVar, dVar.g);
                            }
                        }
                    });
                } catch (Exception e) {
                    com.sankuai.xm.recorder.b.a(e, "autoFocus failed", new Object[0]);
                }
            }
        });
        this.l = new d(this.s);
        com.sankuai.xm.recorder.d dVar = this.l;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.recorder.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "ed2c0a46ebd576e779d41d05c992c3bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "ed2c0a46ebd576e779d41d05c992c3bd");
        } else {
            dVar.k = getApplicationContext();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa33fb89d6e00b437ddf2d127ada95b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa33fb89d6e00b437ddf2d127ada95b1");
            return;
        }
        super.onWindowFocusChanged(z);
        if (this.n) {
            return;
        }
        this.n = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9f7534852b4ea060bb1b681028401b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9f7534852b4ea060bb1b681028401b7");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.e.getLayoutParams();
        int top = getWindow().findViewById(16908290).getTop() + this.k.getBottom();
        Point c = w.c(this);
        float a = (c.y - w.a(this, 90.0f)) - top;
        layoutParams.width = c.x;
        layoutParams.height = (int) a;
        this.d.setLayoutParams(layoutParams);
        this.e.setLayoutParams(layoutParams2);
        this.d.setVisibility(0);
        this.l.a(this.d.getHolder());
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a87e087c1b4bda44f6ebbeda09ba6ef0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a87e087c1b4bda44f6ebbeda09ba6ef0");
            return;
        }
        this.m = i;
        switch (this.m) {
            case 1:
            case 5:
                a(103);
                this.g.setVisibility(8);
                this.g.setProgress(0);
                this.e.setVisibility(0);
                this.h.setVisibility(8);
                return;
            case 2:
                return;
            case 3:
                a(103, 50, true);
                this.q = System.currentTimeMillis();
                this.h.setVisibility(0);
                this.h.setText(R.string.xm_sdk_video_record_do_not_release_finger);
                this.h.setBackgroundColor(getResources().getColor(R.color.videolib_record_remind_cancel_bg));
                this.g.setVisibility(0);
                this.g.setProgressDrawable(this.i);
                this.e.setVisibility(0);
                return;
            case 4:
                this.h.setVisibility(0);
                this.h.setText(R.string.xm_sdk_video_record_move_to_cancel);
                this.h.setBackgroundColor(getResources().getColor(R.color.videolib_main_color));
                this.g.setVisibility(0);
                this.g.setProgressDrawable(this.i);
                this.e.setVisibility(0);
                return;
            case 6:
                this.h.setVisibility(0);
                this.g.setVisibility(0);
                this.g.setProgressDrawable(this.j);
                this.h.setText(R.string.xm_sdk_video_record_release_to_cancel);
                this.h.setBackgroundColor(getResources().getColor(R.color.videolib_record_remind_cancel_bg));
                this.e.setVisibility(4);
                return;
            case 7:
                this.g.setVisibility(8);
                this.g.setProgress(0);
                this.e.setVisibility(0);
                a(103);
                this.h.setVisibility(8);
                return;
            default:
                return;
        }
    }

    @Override // com.sankuai.xm.video.BaseActivity
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0352590142bb49b99d8f05a00a6cbb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0352590142bb49b99d8f05a00a6cbb1");
        } else if (i != 103) {
        } else {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.q);
            if (currentTimeMillis >= 1000 && this.m == 3) {
                this.g.setProgress(this.r - currentTimeMillis);
                c(4);
            } else if (currentTimeMillis <= this.r) {
                this.g.setProgress(this.r - currentTimeMillis);
            } else {
                this.g.setProgress(this.r);
                a(103);
                this.l.b();
                c(5);
            }
        }
    }

    @Override // com.sankuai.xm.video.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ecfa44a5bfb9b6f1f3467c244526e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ecfa44a5bfb9b6f1f3467c244526e6");
        } else {
            super.onDestroy();
        }
    }

    @Override // com.sankuai.xm.video.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac61033a5c1c69414260183c18b28c73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac61033a5c1c69414260183c18b28c73");
            return;
        }
        super.onPause();
        if (this.m == 4 || this.m == 3) {
            this.l.a();
        }
        this.l.c();
        finish();
    }
}
