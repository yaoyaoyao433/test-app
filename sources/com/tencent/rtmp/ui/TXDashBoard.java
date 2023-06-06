package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.text.SimpleDateFormat;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXDashBoard extends LinearLayout {
    protected TextView a;
    protected TextView b;
    protected ScrollView c;
    protected StringBuffer d;
    protected int e;
    private final SimpleDateFormat f;
    private boolean g;

    public TXDashBoard(Context context) {
        this(context, null);
    }

    public TXDashBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new StringBuffer("");
        this.e = 3000;
        this.f = new SimpleDateFormat("HH:mm:ss.SSS");
        this.g = false;
        setOrientation(1);
        setVisibility(4);
    }

    public void setStatusTextSize(float f) {
        if (this.a != null) {
            this.a.setTextSize(f);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.a != null) {
            this.a.setPadding(i, i2, i3, 0);
        }
        if (this.c != null) {
            this.c.setPadding(i, 0, i3, i4);
        }
    }

    public void setEventTextSize(float f) {
        if (this.b != null) {
            this.b.setTextSize(f);
        }
    }

    public void a(CharSequence charSequence) {
        if (this.a != null) {
            this.a.setText(charSequence);
        }
    }

    public void setLogMsgLenLimit(int i) {
        this.e = i;
    }

    public void setShowLevel(int i) {
        switch (i) {
            case 0:
                if (this.a != null) {
                    this.a.setVisibility(4);
                }
                if (this.c != null) {
                    this.c.setVisibility(4);
                }
                setVisibility(4);
                return;
            case 1:
                b();
                this.a.setVisibility(0);
                this.c.setVisibility(4);
                setVisibility(0);
                return;
            default:
                b();
                this.a.setVisibility(0);
                this.c.setVisibility(0);
                setVisibility(0);
                return;
        }
    }

    private void b() {
        if (this.a != null) {
            return;
        }
        this.a = new TextView(getContext());
        this.b = new TextView(getContext());
        this.c = new ScrollView(getContext());
        this.a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.a.setTextColor(-49023);
        this.a.setTypeface(Typeface.MONOSPACE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.c.setPadding(0, 10, 0, 0);
        this.c.setLayoutParams(layoutParams);
        this.c.setVerticalScrollBarEnabled(true);
        this.c.setScrollbarFadingEnabled(true);
        this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b.setTextColor(-49023);
        this.c.addView(this.b);
        addView(this.a);
        addView(this.c);
        if (this.d.length() <= 0) {
            StringBuffer stringBuffer = this.d;
            stringBuffer.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + "\n");
        }
        this.b.setText(this.d.toString());
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "[" + this.f.format(Long.valueOf(System.currentTimeMillis())) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str + "\n";
        if (this.d.length() <= 0) {
            this.d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + "\n");
        }
        while (this.d.length() > this.e) {
            int indexOf = this.d.indexOf("\n");
            if (indexOf == 0) {
                indexOf = 1;
            }
            this.d = this.d.delete(0, indexOf);
        }
        StringBuffer stringBuffer = this.d;
        stringBuffer.append(str2);
        this.d = stringBuffer;
        if (this.b != null) {
            this.b.setText(this.d.toString());
        }
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void a() {
        this.d.setLength(0);
        if (this.a != null) {
            this.a.setText("");
        }
        if (this.b != null) {
            this.b.setText("");
        }
    }

    public void a(Bundle bundle, Bundle bundle2, int i) {
        String string;
        if (this.g || i == 2011 || i == 2012) {
            return;
        }
        if (bundle != null && this.a != null) {
            this.a.setText(a(bundle));
        }
        if (this.d.length() <= 0) {
            StringBuffer stringBuffer = this.d;
            stringBuffer.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + "\n");
        }
        if (bundle2 == null || (string = bundle2.getString("EVT_MSG")) == null || string.isEmpty()) {
            return;
        }
        a(i, string);
        if (this.b != null) {
            this.b.setText(this.d.toString());
        }
        if (getVisibility() != 0 || this.c == null || this.b == null) {
            return;
        }
        a(this.c, this.b);
    }

    protected void a(int i, String str) {
        if (i == 1020) {
            return;
        }
        String format = new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(System.currentTimeMillis()));
        while (this.d.length() > this.e) {
            int indexOf = this.d.indexOf("\n");
            if (indexOf == 0) {
                indexOf = 1;
            }
            this.d = this.d.delete(0, indexOf);
        }
        StringBuffer stringBuffer = this.d;
        stringBuffer.append("\n[" + format + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str);
        this.d = stringBuffer;
    }

    protected String a(Bundle bundle) {
        return String.format("%-16s %-16s %-16s\n%-12s %-12s %-12s %-12s\n%-14s %-14s %-14s\n%-16s %-16s", "CPU:" + bundle.getString("CPU_USAGE"), "RES:" + bundle.getInt("VIDEO_WIDTH") + "*" + bundle.getInt("VIDEO_HEIGHT"), "SPD:" + bundle.getInt("NET_SPEED") + "Kbps", "JIT:" + bundle.getInt("NET_JITTER"), "FPS:" + bundle.getInt("VIDEO_FPS"), "GOP:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP) + "s", "ARA:" + bundle.getInt("AUDIO_BITRATE") + "Kbps", "QUE:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) + " | " + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE) + CommonConstant.Symbol.COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE) + CommonConstant.Symbol.COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE) + " | " + bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL) + CommonConstant.Symbol.COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL) + CommonConstant.Symbol.COMMA + String.format("%.1f", Float.valueOf(bundle.getFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD))).toString(), "VRA:" + bundle.getInt("VIDEO_BITRATE") + "Kbps", "DRP:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_DROP) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_DROP), "SVR:" + bundle.getString("SERVER_IP"), "AUDIO:" + bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO));
    }

    private void a(ScrollView scrollView, View view) {
        if (scrollView == null || view == null) {
            return;
        }
        int measuredHeight = view.getMeasuredHeight() - scrollView.getMeasuredHeight();
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        scrollView.scrollTo(0, measuredHeight);
    }
}
