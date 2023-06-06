package com.dianping.shield.dynamic.utils;

import android.content.Context;
import com.dianping.shield.dynamic.model.vc.SeparatorLineInfo;
import com.dianping.shield.node.useritem.DividerStyle;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/dianping/shield/dynamic/utils/DividerUtil;", "", "()V", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DividerUtil {
    public static final Companion Companion = new Companion(null);
    private static final int DIVIDER_TYPE_AUTO = -1;
    private static final int DIVIDER_TYPE_BOTTOM = 3;
    private static final int DIVIDER_TYPE_MIDDLE = 2;
    private static final int DIVIDER_TYPE_NONE = 0;
    private static final int DIVIDER_TYPE_SINGLE = 4;
    private static final int DIVIDER_TYPE_TOP = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/dynamic/utils/DividerUtil$Companion;", "", "()V", "DIVIDER_TYPE_AUTO", "", "DIVIDER_TYPE_BOTTOM", "DIVIDER_TYPE_MIDDLE", "DIVIDER_TYPE_NONE", "DIVIDER_TYPE_SINGLE", "DIVIDER_TYPE_TOP", "getDividerStyle", "Lcom/dianping/shield/node/useritem/DividerStyle;", "context", "Landroid/content/Context;", "separatorLineInfo", "Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", DMKeys.KEY_SEPARATOR_LINE_STYLE, "(Landroid/content/Context;Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;Ljava/lang/Integer;)Lcom/dianping/shield/node/useritem/DividerStyle;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @NotNull
        public static /* synthetic */ DividerStyle getDividerStyle$default(Companion companion, Context context, SeparatorLineInfo separatorLineInfo, Integer num, int i, Object obj) {
            if ((i & 4) != 0) {
                num = -1;
            }
            return companion.getDividerStyle(context, separatorLineInfo, num);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.dianping.shield.node.useritem.DividerStyle getDividerStyle(@org.jetbrains.annotations.Nullable android.content.Context r19, @org.jetbrains.annotations.Nullable com.dianping.shield.dynamic.model.vc.SeparatorLineInfo r20, @org.jetbrains.annotations.Nullable java.lang.Integer r21) {
            /*
                Method dump skipped, instructions count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.utils.DividerUtil.Companion.getDividerStyle(android.content.Context, com.dianping.shield.dynamic.model.vc.SeparatorLineInfo, java.lang.Integer):com.dianping.shield.node.useritem.DividerStyle");
        }
    }
}
