package com.meituan.android.ptcommonim.feedback.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class PTQuestionSubmitParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bizExtraInfo;
    public int channel;
    public int fromType;
    public String inputContent;
    public List<String> labels;
    public String merchantIdStr;
    public long msgId;
    public int score;
    public int solved = -1;
    public transient int errorCode = 0;
}
