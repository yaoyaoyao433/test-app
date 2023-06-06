package com.sankuai.waimai.platform.mach.videoextend;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Formatter;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class VideoCoverView extends FrameLayout implements com.meituan.android.mtplayer.video.callback.a {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private TextView c;

    @Override // com.meituan.android.mtplayer.video.callback.a
    public View getView() {
        return this;
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public void setPlayerController(com.meituan.android.mtplayer.video.callback.c cVar) {
    }

    public ImageView getVideoBottomImage() {
        return this.b;
    }

    public VideoCoverView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54aac686b13aec44f5b9de5e9221e0ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54aac686b13aec44f5b9de5e9221e0ef");
        }
    }

    private VideoCoverView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13f831fdcb5ea558332aa30b45973ce4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13f831fdcb5ea558332aa30b45973ce4");
        }
    }

    public VideoCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2640393a2f219eff9c04439a65eea0f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2640393a2f219eff9c04439a65eea0f8");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72c74320e356dcdc88388831f0055caa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72c74320e356dcdc88388831f0055caa");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.video_player_cover_layout, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.iv_video_bottom);
        this.c = (TextView) findViewById(R.id.play_position);
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e5088d9059727974752894d34d96ad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e5088d9059727974752894d34d96ad1");
        } else if (this.b != null) {
            if (i != -1) {
                switch (i) {
                    case 1:
                        this.b.setVisibility(0);
                        return;
                    case 2:
                        this.b.setVisibility(0);
                        return;
                    case 3:
                        this.b.setVisibility(8);
                        return;
                    case 4:
                        this.b.setVisibility(0);
                        return;
                    default:
                        return;
                }
            }
            this.b.setVisibility(0);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i, int i2, int i3) {
        String str;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55cd8cc4c06b6e358ed9b8379ed9f29c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55cd8cc4c06b6e358ed9b8379ed9f29c");
        } else if (this.c.getVisibility() == 0) {
            TextView textView = this.c;
            long j = i2 - i;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "57da6b2d472bff1175690737f2c730bc", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "57da6b2d472bff1175690737f2c730bc");
            } else if (j <= 0 || j >= 86400000) {
                str = "0:00";
            } else {
                long j2 = j / 1000;
                long j3 = j2 % 60;
                long j4 = (j2 / 60) % 60;
                long j5 = j2 / 3600;
                Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
                str = j5 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%01d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
            }
            textView.setText(str);
        }
    }

    public void setPlayPositionVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462b2ae5dfd35638664d153ec7bd9540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462b2ae5dfd35638664d153ec7bd9540");
        } else {
            this.c.setVisibility(i);
        }
    }
}
