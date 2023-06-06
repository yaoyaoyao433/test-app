package com.dianping.base.push.pushservice.monitor;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.c;
import com.dianping.base.push.pushservice.e;
import com.dianping.base.push.pushservice.f;
import com.dianping.base.push.pushservice.util.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends a {
    public static ChangeQuickRedirect b;
    private Context c;

    public b(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def90c2d6e2bb3c6f2fe6ab8f5623356", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def90c2d6e2bb3c6f2fe6ab8f5623356");
        } else {
            this.c = context;
        }
    }

    @Override // com.dianping.monitor.impl.a
    public final String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d433d7343b8bbac56d36de50af048ac", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d433d7343b8bbac56d36de50af048ac") : f.e.b();
    }

    @Override // com.dianping.base.push.pushservice.monitor.a
    public final void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3) {
        long j2;
        Object[] objArr = {0L, str, 0, Integer.valueOf(i2), Integer.valueOf(i3), 0, 0, Integer.valueOf(i6), null, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "645a6f5fc3ce2af6f6ce70b27e4f0003", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "645a6f5fc3ce2af6f6ce70b27e4f0003");
        } else if (!TextUtils.isEmpty(str)) {
            String str4 = "";
            try {
                str4 = e.a(this.c).a("cat_pv_logging", "");
            } catch (Exception e) {
                c.d("PushMonitorService", e.toString());
            }
            String[] split = str4.split(CommonConstant.Symbol.COMMA);
            if (split.length > 0 && !TextUtils.isEmpty(split[0])) {
                try {
                    j2 = Long.parseLong(split[0]);
                } catch (Exception e2) {
                    c.d("PushMonitorService", e2.toString());
                    j2 = -1;
                }
                if (j2 == a()) {
                    for (int i7 = 1; i7 < split.length; i7++) {
                        if (split[i7].equals(str)) {
                            return;
                        }
                    }
                } else {
                    str4 = "";
                }
            }
            StringBuilder sb = new StringBuilder(str4);
            if (sb.length() <= 0) {
                sb.append(a());
            }
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(str);
            try {
                e.a(this.c).b("cat_pv_logging", sb.toString());
            } catch (Exception e3) {
                c.d("PushMonitorService", e3.toString());
            }
            super.pv4(0L, str, 0, i2, i3, 0, 0, i6, null, str3, 100);
        }
    }

    private long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e1ac6a75ee7bd106573825b303037a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e1ac6a75ee7bd106573825b303037a5")).longValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                String localDate = LocalDateTime.now().toLocalDate().toString();
                return LocalDateTime.parse(localDate + " 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            }
            return i.a(i.a(System.currentTimeMillis()));
        } catch (Exception e) {
            c.d("PushMonitorService", e.toString());
            return 0L;
        }
    }
}
