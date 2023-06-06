package com.sankuai.waimai.imbase.push;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.imbase.view.IMArrowTextView;
import com.sankuai.waimai.imbase.view.WmImStrokeRadiusImageView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.imbase.window.a {
    public static ChangeQuickRedirect a;
    TextView b;
    private final String c;
    private final WmImStrokeRadiusImageView h;
    private TextView i;
    private IMArrowTextView j;

    @Override // com.sankuai.waimai.imbase.window.a
    public final int a() {
        return R.layout.wm_imbase_im_in_app_push_window;
    }

    public a(@NonNull Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a9ee94e7df83fec643b925ed4f02c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a9ee94e7df83fec643b925ed4f02c0");
            return;
        }
        this.c = "\\[[^\\[|\\]]+\\|[^\\[|\\]]+\\]";
        this.j = (IMArrowTextView) this.f.findViewById(R.id.txt_im_in_app_push_content);
        this.i = (TextView) this.f.findViewById(R.id.txt_im_in_app_push_title);
        this.b = (TextView) this.f.findViewById(R.id.txt_im_in_app_push_time);
        this.h = (WmImStrokeRadiusImageView) this.f.findViewById(R.id.txt_im_in_app_icon);
    }

    public final a a(String str) {
        String spannableStringBuilder;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6c169bd8f86520257617065400d7929", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6c169bd8f86520257617065400d7929");
        }
        IMArrowTextView iMArrowTextView = this.j;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abb54e394d111eed2d614eb25e5f822e", RobustBitConfig.DEFAULT_VALUE)) {
            spannableStringBuilder = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abb54e394d111eed2d614eb25e5f822e");
        } else {
            Pattern compile = Pattern.compile("\\[[^\\[|\\]]+\\|[^\\[|\\]]+\\]");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            Matcher matcher = compile.matcher(str);
            while (matcher.find()) {
                matcher.start();
                matcher.end();
                String trim = matcher.group().trim();
                trim.substring(1, trim.indexOf(124)).length();
            }
            spannableStringBuilder = spannableStringBuilder2.toString();
        }
        iMArrowTextView.setText(spannableStringBuilder);
        return this;
    }

    public final a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf9d78e39592b0fc785080ff54e3e09", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf9d78e39592b0fc785080ff54e3e09");
        }
        if (TextUtils.isEmpty(str)) {
            str = this.e.getString(R.string.app_name);
        }
        this.i.setText(str);
        return this;
    }

    public final a a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70f4710dd3f423eb471a03566fedaaf8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70f4710dd3f423eb471a03566fedaaf8");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.imbase.imageloader.a.a;
        b.C0608b c = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6bfab36caef434aa8479e56c13fed0e6", RobustBitConfig.DEFAULT_VALUE) ? (b.C0608b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6bfab36caef434aa8479e56c13fed0e6") : com.sankuai.meituan.mtimageloader.loader.a.c();
        c.b = this.e;
        c.i = i;
        c.j = i;
        c.c = str;
        c.a((ImageView) this.h);
        return this;
    }

    public static boolean a(Date date, Date date2) {
        Object[] objArr = {date, date2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2b0d0572178924a3c1481e0e6600567", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2b0d0572178924a3c1481e0e6600567")).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            return Integer.parseInt(simpleDateFormat.format(date)) == Integer.parseInt(simpleDateFormat.format(date2));
        } catch (Exception unused) {
            return false;
        }
    }
}
