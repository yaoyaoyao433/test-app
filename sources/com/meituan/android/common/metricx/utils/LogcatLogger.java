package com.meituan.android.common.metricx.utils;

import android.util.Log;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogcatLogger implements ILogger {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int logLevel;
    private final String tag;

    public LogcatLogger(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d58579a779c9c84d775989782d3dfd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d58579a779c9c84d775989782d3dfd4");
            return;
        }
        this.logLevel = 6;
        this.tag = str;
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void v(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b40078a80cb36682734c99a8487bed47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b40078a80cb36682734c99a8487bed47");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(this.tag + ": " + str);
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void v(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95f90c03db3f58963615af6e439348b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95f90c03db3f58963615af6e439348b2");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(this.tag + ": " + concatMessage(str, objArr));
        }
    }

    private String concatMessage(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bbf49336aaaef29168e1199550df6c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bbf49336aaaef29168e1199550df6c0");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (Object obj : objArr) {
            sb.append(Constants.SPACE);
            if (obj == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(obj.toString());
            }
        }
        return sb.toString();
    }

    private String formatMessage(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2848e1183f0586794ae9e4471ee525e3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2848e1183f0586794ae9e4471ee525e3") : String.format(Locale.CHINA, str, objArr);
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void vF(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e23e2420f8bd59ad13f915e1e95b128", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e23e2420f8bd59ad13f915e1e95b128");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(this.tag + ": " + formatMessage(str, objArr));
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fd2a554d4562751bdebafb18356a8b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fd2a554d4562751bdebafb18356a8b8");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(this.tag + ": " + str);
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b7e4dac39ab8e1009eead13121a8da4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b7e4dac39ab8e1009eead13121a8da4");
        } else {
            dt(this.tag, str, objArr);
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void dt(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9653c5c7759c6a087dcb664a84222b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9653c5c7759c6a087dcb664a84222b68");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(str + ": " + concatMessage(str2, objArr));
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void dF(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bbb639d5a2b653fe83f229877b276a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bbb639d5a2b653fe83f229877b276a6");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(this.tag + ": " + formatMessage(str, objArr));
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d26e238046c215b3985644e7a73d506a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d26e238046c215b3985644e7a73d506a");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(this.tag + ": " + str);
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void i(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86d76bf812c59e0e838e0fbb2aef22be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86d76bf812c59e0e838e0fbb2aef22be");
        } else {
            it(this.tag, str, objArr);
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void it(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "098de07e074dadcb178e2c9668fa597d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "098de07e074dadcb178e2c9668fa597d");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(str + ": " + concatMessage(str2, objArr));
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void iF(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8afd97124b3899b37c86f51ebf2bd2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8afd97124b3899b37c86f51ebf2bd2f");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(this.tag + ": " + formatMessage(str, objArr));
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bd5ecfe94cd0654da6090cf822bdf29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bd5ecfe94cd0654da6090cf822bdf29");
        } else {
            et(this.tag, str);
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void et(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38d64198adda4ce7027ba90eff7f85be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38d64198adda4ce7027ba90eff7f85be");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(str + ": " + str2);
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void et(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "307877f989b8f601be5ce49efcdfbdf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "307877f989b8f601be5ce49efcdfbdf6");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(str + ": " + str2 + StringUtil.SPACE + Log.getStackTraceString(th));
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void e(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f17c7a33c59e3cfa5908e1925f690a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f17c7a33c59e3cfa5908e1925f690a79");
        } else {
            et(this.tag, str, th);
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void e(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c98fee0aeb57b94cde5e3634dc7b714d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c98fee0aeb57b94cde5e3634dc7b714d");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(this.tag + ": " + concatMessage(str, objArr));
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void eF(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c95502257acff9b38c5852140ca1b5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c95502257acff9b38c5852140ca1b5b");
        } else if (this.logLevel == 2) {
            PrintStream printStream = System.out;
            printStream.println(this.tag + ": " + formatMessage(str, objArr));
        }
    }

    @Override // com.meituan.android.common.metricx.utils.ILogger
    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    public int getLogLevel() {
        return this.logLevel;
    }
}
