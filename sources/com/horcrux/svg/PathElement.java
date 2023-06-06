package com.horcrux.svg;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PathElement {
    Point[] points;
    ElementType type;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PathElement(ElementType elementType, Point[] pointArr) {
        this.type = elementType;
        this.points = pointArr;
    }
}
