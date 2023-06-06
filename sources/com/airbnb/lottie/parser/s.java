package com.airbnb.lottie.parser;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class s {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r0.equals("s") == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.airbnb.lottie.model.content.g a(android.util.JsonReader r10, com.airbnb.lottie.e r11) throws java.io.IOException {
        /*
            r10.beginObject()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r0 = 0
        L8:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto Lb1
            java.lang.String r4 = r10.nextName()
            int r5 = r4.hashCode()
            r6 = 111(0x6f, float:1.56E-43)
            r7 = 1
            r8 = 2
            r9 = -1
            if (r5 == r6) goto L3b
            r6 = 3588(0xe04, float:5.028E-42)
            if (r5 == r6) goto L31
            r6 = 3357091(0x3339a3, float:4.704286E-39)
            if (r5 == r6) goto L27
            goto L45
        L27:
            java.lang.String r5 = "mode"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L45
            r5 = 0
            goto L46
        L31:
            java.lang.String r5 = "pt"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L45
            r5 = 1
            goto L46
        L3b:
            java.lang.String r5 = "o"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L45
            r5 = 2
            goto L46
        L45:
            r5 = -1
        L46:
            switch(r5) {
                case 0: goto L57;
                case 1: goto L52;
                case 2: goto L4d;
                default: goto L49;
            }
        L49:
            r10.skipValue()
            goto L8
        L4d:
            com.airbnb.lottie.model.animatable.d r3 = com.airbnb.lottie.parser.d.a(r10, r11)
            goto L8
        L52:
            com.airbnb.lottie.model.animatable.h r2 = com.airbnb.lottie.parser.d.c(r10, r11)
            goto L8
        L57:
            java.lang.String r0 = r10.nextString()
            int r5 = r0.hashCode()
            r6 = 97
            if (r5 == r6) goto L7f
            r6 = 105(0x69, float:1.47E-43)
            if (r5 == r6) goto L75
            r6 = 115(0x73, float:1.61E-43)
            if (r5 == r6) goto L6c
            goto L89
        L6c:
            java.lang.String r5 = "s"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L89
            goto L8a
        L75:
            java.lang.String r5 = "i"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L89
            r7 = 2
            goto L8a
        L7f:
            java.lang.String r5 = "a"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L89
            r7 = 0
            goto L8a
        L89:
            r7 = -1
        L8a:
            switch(r7) {
                case 0: goto Lad;
                case 1: goto La9;
                case 2: goto La0;
                default: goto L8d;
            }
        L8d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Unknown mask mode "
            r0.<init>(r5)
            r0.append(r4)
            java.lang.String r4 = ". Defaulting to Add."
            r0.append(r4)
            int r0 = com.airbnb.lottie.model.content.g.a.a
            goto L8
        La0:
            java.lang.String r0 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r11.a(r0)
            int r0 = com.airbnb.lottie.model.content.g.a.c
            goto L8
        La9:
            int r0 = com.airbnb.lottie.model.content.g.a.b
            goto L8
        Lad:
            int r0 = com.airbnb.lottie.model.content.g.a.a
            goto L8
        Lb1:
            r10.endObject()
            com.airbnb.lottie.model.content.g r10 = new com.airbnb.lottie.model.content.g
            r10.<init>(r0, r2, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.s.a(android.util.JsonReader, com.airbnb.lottie.e):com.airbnb.lottie.model.content.g");
    }
}
