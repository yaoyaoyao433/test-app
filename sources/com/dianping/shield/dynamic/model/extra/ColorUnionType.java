package com.dianping.shield.dynamic.model.extra;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "", "()V", "GradientColorInfo", "StringColor", "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$StringColor;", "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class ColorUnionType {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$StringColor;", "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "color", "", "(Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class StringColor extends ColorUnionType {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NotNull
        private final String color;

        @NotNull
        public static /* synthetic */ StringColor copy$default(StringColor stringColor, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringColor.color;
            }
            return stringColor.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.color;
        }

        @NotNull
        public final StringColor copy(@NotNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1334fc170df643012403efe385840c2", RobustBitConfig.DEFAULT_VALUE)) {
                return (StringColor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1334fc170df643012403efe385840c2");
            }
            h.b(str, "color");
            return new StringColor(str);
        }

        public final boolean equals(@Nullable Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2907a3eccc7891b592dc4599df937ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2907a3eccc7891b592dc4599df937ea")).booleanValue() : this == obj || ((obj instanceof StringColor) && h.a((Object) this.color, (Object) ((StringColor) obj).color));
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14b4a8e56a3a420302568e828526f51b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14b4a8e56a3a420302568e828526f51b")).intValue();
            }
            String str = this.color;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d66613c8cb4e9c4883b186d5a91c34a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d66613c8cb4e9c4883b186d5a91c34a");
            }
            return "StringColor(color=" + this.color + CommonConstant.Symbol.BRACKET_RIGHT;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringColor(@NotNull String str) {
            super(null);
            h.b(str, "color");
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "504ae809ad1c134ce36e0f05743541d4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "504ae809ad1c134ce36e0f05743541d4");
            } else {
                this.color = str;
            }
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }
    }

    public ColorUnionType() {
    }

    public /* synthetic */ ColorUnionType(f fVar) {
        this();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR, "", DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR, DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getEndColor", "()Ljava/lang/String;", "getOrientation", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartColor", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "equals", "", "other", "", "hashCode", "toString", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class GradientColorInfo extends ColorUnionType {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NotNull
        private final String endColor;
        @Nullable
        private final Integer orientation;
        @NotNull
        private final String startColor;

        @NotNull
        public static /* synthetic */ GradientColorInfo copy$default(GradientColorInfo gradientColorInfo, String str, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gradientColorInfo.startColor;
            }
            if ((i & 2) != 0) {
                str2 = gradientColorInfo.endColor;
            }
            if ((i & 4) != 0) {
                num = gradientColorInfo.orientation;
            }
            return gradientColorInfo.copy(str, str2, num);
        }

        @NotNull
        public final String component1() {
            return this.startColor;
        }

        @NotNull
        public final String component2() {
            return this.endColor;
        }

        @Nullable
        public final Integer component3() {
            return this.orientation;
        }

        @NotNull
        public final GradientColorInfo copy(@NotNull String str, @NotNull String str2, @Nullable Integer num) {
            Object[] objArr = {str, str2, num};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a28f3bb36bb3da9f5b64ac82638d66c", RobustBitConfig.DEFAULT_VALUE)) {
                return (GradientColorInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a28f3bb36bb3da9f5b64ac82638d66c");
            }
            h.b(str, DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR);
            h.b(str2, DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR);
            return new GradientColorInfo(str, str2, num);
        }

        public final boolean equals(@Nullable Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67ab02f4a3f7a3e6ae2363e84392e435", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67ab02f4a3f7a3e6ae2363e84392e435")).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof GradientColorInfo) {
                    GradientColorInfo gradientColorInfo = (GradientColorInfo) obj;
                    if (!h.a((Object) this.startColor, (Object) gradientColorInfo.startColor) || !h.a((Object) this.endColor, (Object) gradientColorInfo.endColor) || !h.a(this.orientation, gradientColorInfo.orientation)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fb6cefdd90a727f713142f766fb3cc4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fb6cefdd90a727f713142f766fb3cc4")).intValue();
            }
            String str = this.startColor;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.endColor;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Integer num = this.orientation;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96cd6e3973e7197ea19168d4109f6ce3", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96cd6e3973e7197ea19168d4109f6ce3");
            }
            return "GradientColorInfo(startColor=" + this.startColor + ", endColor=" + this.endColor + ", orientation=" + this.orientation + CommonConstant.Symbol.BRACKET_RIGHT;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GradientColorInfo(@NotNull String str, @NotNull String str2, @Nullable Integer num) {
            super(null);
            h.b(str, DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR);
            h.b(str2, DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR);
            Object[] objArr = {str, str2, num};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa18f9cec683ff4c02a0b5deb968401e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa18f9cec683ff4c02a0b5deb968401e");
                return;
            }
            this.startColor = str;
            this.endColor = str2;
            this.orientation = num;
        }

        @NotNull
        public final String getEndColor() {
            return this.endColor;
        }

        @Nullable
        public final Integer getOrientation() {
            return this.orientation;
        }

        @NotNull
        public final String getStartColor() {
            return this.startColor;
        }
    }
}
