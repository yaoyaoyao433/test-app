package com.dianping.shield.dynamic.diff;

import com.dianping.shield.component.extensions.common.BaseScrollableRowItem;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/dianping/shield/dynamic/diff/ScrollEventDiff;", "", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "createScrollEventDispatcher", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;", "scrollEvent", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "lastUseScrollEventDispatcherProvider", "setScrollEventDispatcher", "", "baseScrollableRowItem", "Lcom/dianping/shield/component/extensions/common/BaseScrollableRowItem;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ScrollEventDiff {
    @Nullable
    ComponentScrollEventHelper.IEventDispatcherProvider createScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @Nullable ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider);

    @NotNull
    DynamicChassisInterface getHostChassis();

    void setScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @NotNull BaseScrollableRowItem baseScrollableRowItem);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
            if ((r0.length() > 0) != true) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
            if ((r0.length() > 0) != true) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
            if ((r0.length() > 0) != true) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
            if ((r0.length() > 0) != true) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
            if ((r0.length() > 0) == true) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00cb, code lost:
            if ((r0.length() > 0) != true) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00de, code lost:
            if ((r0.length() > 0) == true) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00e0, code lost:
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0104, code lost:
            if ((r0.length() > 0) != true) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0117, code lost:
            if ((r0.length() > 0) == true) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0119, code lost:
            r8 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void setScrollEventDispatcher(final com.dianping.shield.dynamic.diff.ScrollEventDiff r12, @org.jetbrains.annotations.NotNull final com.dianping.shield.dynamic.model.extra.ScrollEvent r13, @org.jetbrains.annotations.NotNull com.dianping.shield.component.extensions.common.BaseScrollableRowItem r14) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.ScrollEventDiff.DefaultImpls.setScrollEventDispatcher(com.dianping.shield.dynamic.diff.ScrollEventDiff, com.dianping.shield.dynamic.model.extra.ScrollEvent, com.dianping.shield.component.extensions.common.BaseScrollableRowItem):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
            if ((r0.length() > 0) != true) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
            if ((r0.length() > 0) != true) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
            if ((r0.length() > 0) != true) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
            if ((r0.length() > 0) != true) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
            if ((r0.length() > 0) == true) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
            if ((r0.length() > 0) != true) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00d8, code lost:
            if ((r0.length() > 0) == true) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00da, code lost:
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x00fe, code lost:
            if ((r0.length() > 0) != true) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0111, code lost:
            if ((r0.length() > 0) == true) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0113, code lost:
            r8 = true;
         */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.dianping.shield.component.utils.ComponentScrollEventHelper.IEventDispatcherProvider createScrollEventDispatcher(final com.dianping.shield.dynamic.diff.ScrollEventDiff r12, @org.jetbrains.annotations.NotNull final com.dianping.shield.dynamic.model.extra.ScrollEvent r13, @org.jetbrains.annotations.Nullable com.dianping.shield.component.utils.ComponentScrollEventHelper.IEventDispatcherProvider r14) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.ScrollEventDiff.DefaultImpls.createScrollEventDispatcher(com.dianping.shield.dynamic.diff.ScrollEventDiff, com.dianping.shield.dynamic.model.extra.ScrollEvent, com.dianping.shield.component.utils.ComponentScrollEventHelper$IEventDispatcherProvider):com.dianping.shield.component.utils.ComponentScrollEventHelper$IEventDispatcherProvider");
        }
    }
}
