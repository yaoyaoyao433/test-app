package com.meituan.android.recce.views.anim.node;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceAnimConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public float[] alpha;
    public long duration;
    public String interpolator;
    public int repeatCount;
    public int repeatMode;
    public float[] rotation;
    public float[] rotationX;
    public float[] rotationY;
    public float[] scaleX;
    public float[] scaleY;
    public long startDelay;
    public float[] translationX;
    public float[] translationY;

    public float[] getAlpha() {
        return this.alpha;
    }

    public void setAlpha(float[] fArr) {
        this.alpha = fArr;
    }

    public float[] getScaleY() {
        return this.scaleY;
    }

    public void setScaleY(float[] fArr) {
        this.scaleY = fArr;
    }

    public float[] getScaleX() {
        return this.scaleX;
    }

    public void setScaleX(float[] fArr) {
        this.scaleX = fArr;
    }

    public float[] getTranslationY() {
        return this.translationY;
    }

    public void setTranslationY(float[] fArr) {
        this.translationY = fArr;
    }

    public float[] getTranslationX() {
        return this.translationX;
    }

    public void setTranslationX(float[] fArr) {
        this.translationX = fArr;
    }

    public float[] getRotation() {
        return this.rotation;
    }

    public void setRotation(float[] fArr) {
        this.rotation = fArr;
    }

    public float[] getRotationX() {
        return this.rotationX;
    }

    public void setRotationX(float[] fArr) {
        this.rotationX = fArr;
    }

    public float[] getRotationY() {
        return this.rotationY;
    }

    public void setRotationY(float[] fArr) {
        this.rotationY = fArr;
    }

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d28d7464c7c80fe0c6509cce1d3f744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d28d7464c7c80fe0c6509cce1d3f744");
        } else {
            this.duration = j;
        }
    }

    public long getStartDelay() {
        return this.startDelay;
    }

    public void setStartDelay(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcbe915d1cc2f2dbb74a09ee4676e87c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcbe915d1cc2f2dbb74a09ee4676e87c");
        } else {
            this.startDelay = j;
        }
    }

    public String getInterpolator() {
        return this.interpolator;
    }

    public void setInterpolator(String str) {
        this.interpolator = str;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public void setRepeatCount(int i) {
        this.repeatCount = i;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public void setRepeatMode(int i) {
        this.repeatMode = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r13.equals(com.meituan.android.recce.views.anim.RecceAnimUtils.SCALE_Y) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float[] getPropValue(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.recce.views.anim.node.RecceAnimConfig.changeQuickRedirect
            java.lang.String r11 = "7f4bb2bbe3b65495e6ca0d2eb002d9b5"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            float[] r13 = (float[]) r13
            return r13
        L1e:
            float[] r1 = new float[r9]
            r2 = -1
            int r3 = r13.hashCode()
            switch(r3) {
                case -1249320806: goto L74;
                case -1249320805: goto L69;
                case -1225497657: goto L5e;
                case -1225497656: goto L53;
                case -908189618: goto L48;
                case -908189617: goto L3e;
                case -40300674: goto L33;
                case 92909918: goto L29;
                default: goto L28;
            }
        L28:
            goto L7f
        L29:
            java.lang.String r0 = "alpha"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L7f
            r0 = 0
            goto L80
        L33:
            java.lang.String r0 = "rotation"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L7f
            r0 = 5
            goto L80
        L3e:
            java.lang.String r3 = "scaleY"
            boolean r13 = r13.equals(r3)
            if (r13 == 0) goto L7f
            goto L80
        L48:
            java.lang.String r0 = "scaleX"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L7f
            r0 = 2
            goto L80
        L53:
            java.lang.String r0 = "translationY"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L7f
            r0 = 3
            goto L80
        L5e:
            java.lang.String r0 = "translationX"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L7f
            r0 = 4
            goto L80
        L69:
            java.lang.String r0 = "rotationY"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L7f
            r0 = 7
            goto L80
        L74:
            java.lang.String r0 = "rotationX"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L7f
            r0 = 6
            goto L80
        L7f:
            r0 = -1
        L80:
            switch(r0) {
                case 0: goto L99;
                case 1: goto L96;
                case 2: goto L93;
                case 3: goto L90;
                case 4: goto L8d;
                case 5: goto L8a;
                case 6: goto L87;
                case 7: goto L84;
                default: goto L83;
            }
        L83:
            goto L9b
        L84:
            float[] r1 = r12.rotationY
            goto L9b
        L87:
            float[] r1 = r12.rotationX
            goto L9b
        L8a:
            float[] r1 = r12.rotation
            goto L9b
        L8d:
            float[] r1 = r12.translationX
            goto L9b
        L90:
            float[] r1 = r12.translationY
            goto L9b
        L93:
            float[] r1 = r12.scaleX
            goto L9b
        L96:
            float[] r1 = r12.scaleY
            goto L9b
        L99:
            float[] r1 = r12.alpha
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.recce.views.anim.node.RecceAnimConfig.getPropValue(java.lang.String):float[]");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r13.equals(com.meituan.android.recce.views.anim.RecceAnimUtils.START_DELAY) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getControlValue(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.recce.views.anim.node.RecceAnimConfig.changeQuickRedirect
            java.lang.String r11 = "bb2d8afece41107221196b1abaacbd65"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Object r13 = (java.lang.Object) r13
            return r13
        L1e:
            r1 = 0
            r2 = -1
            int r3 = r13.hashCode()
            switch(r3) {
                case -1992012396: goto L53;
                case -1598524863: goto L49;
                case 1159370206: goto L3e;
                case 1571519540: goto L33;
                case 2096253127: goto L28;
                default: goto L27;
            }
        L27:
            goto L5d
        L28:
            java.lang.String r0 = "interpolator"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L5d
            r0 = 4
            goto L5e
        L33:
            java.lang.String r0 = "repeatCount"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L5d
            r0 = 2
            goto L5e
        L3e:
            java.lang.String r0 = "repeatMode"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L5d
            r0 = 3
            goto L5e
        L49:
            java.lang.String r3 = "startDelay"
            boolean r13 = r13.equals(r3)
            if (r13 == 0) goto L5d
            goto L5e
        L53:
            java.lang.String r0 = "duration"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L5d
            r0 = 0
            goto L5e
        L5d:
            r0 = -1
        L5e:
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L73;
                case 2: goto L6c;
                case 3: goto L65;
                case 4: goto L62;
                default: goto L61;
            }
        L61:
            goto L80
        L62:
            java.lang.String r1 = r12.interpolator
            goto L80
        L65:
            int r13 = r12.repeatMode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L80
        L6c:
            int r13 = r12.repeatCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L80
        L73:
            long r0 = r12.startDelay
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L80
        L7a:
            long r0 = r12.duration
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.recce.views.anim.node.RecceAnimConfig.getControlValue(java.lang.String):java.lang.Object");
    }
}
