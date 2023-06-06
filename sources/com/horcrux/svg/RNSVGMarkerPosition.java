package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RNSVGMarkerPosition {
    private static boolean auto_start_reverse_;
    private static int element_index_;
    private static Point in_slope_;
    private static Point origin_;
    private static Point out_slope_;
    private static ArrayList<RNSVGMarkerPosition> positions_;
    private static Point subpath_start_;
    double angle;
    Point origin;
    RNSVGMarkerType type;

    private static double rad2deg(double d) {
        return d * 57.29577951308232d;
    }

    private RNSVGMarkerPosition(RNSVGMarkerType rNSVGMarkerType, Point point, double d) {
        this.type = rNSVGMarkerType;
        this.origin = point;
        this.angle = d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ArrayList<RNSVGMarkerPosition> fromPath(ArrayList<PathElement> arrayList) {
        positions_ = new ArrayList<>();
        element_index_ = 0;
        origin_ = new Point(0.0d, 0.0d);
        subpath_start_ = new Point(0.0d, 0.0d);
        Iterator<PathElement> it = arrayList.iterator();
        while (it.hasNext()) {
            UpdateFromPathElement(it.next());
        }
        PathIsDone();
        return positions_;
    }

    private static void PathIsDone() {
        positions_.add(new RNSVGMarkerPosition(RNSVGMarkerType.kEndMarker, origin_, CurrentAngle(RNSVGMarkerType.kEndMarker)));
    }

    private static double BisectingAngle(double d, double d2) {
        if (Math.abs(d - d2) > 180.0d) {
            d += 360.0d;
        }
        return (d + d2) / 2.0d;
    }

    private static double SlopeAngleRadians(Point point) {
        return Math.atan2(point.y, point.x);
    }

    private static double CurrentAngle(RNSVGMarkerType rNSVGMarkerType) {
        double rad2deg = rad2deg(SlopeAngleRadians(in_slope_));
        double rad2deg2 = rad2deg(SlopeAngleRadians(out_slope_));
        switch (rNSVGMarkerType) {
            case kStartMarker:
                return auto_start_reverse_ ? rad2deg2 + 180.0d : rad2deg2;
            case kMidMarker:
                return BisectingAngle(rad2deg, rad2deg2);
            case kEndMarker:
                return rad2deg;
            default:
                return 0.0d;
        }
    }

    private static Point subtract(Point point, Point point2) {
        return new Point(point2.x - point.x, point2.y - point.y);
    }

    private static boolean isZero(Point point) {
        return point.x == 0.0d && point.y == 0.0d;
    }

    private static void ComputeQuadTangents(SegmentData segmentData, Point point, Point point2, Point point3) {
        segmentData.start_tangent = subtract(point2, point);
        segmentData.end_tangent = subtract(point3, point2);
        if (isZero(segmentData.start_tangent)) {
            segmentData.start_tangent = segmentData.end_tangent;
        } else if (isZero(segmentData.end_tangent)) {
            segmentData.end_tangent = segmentData.start_tangent;
        }
    }

    private static SegmentData ExtractPathElementFeatures(PathElement pathElement) {
        SegmentData segmentData = new SegmentData();
        Point[] pointArr = pathElement.points;
        switch (pathElement.type) {
            case kCGPathElementAddCurveToPoint:
                segmentData.position = pointArr[2];
                segmentData.start_tangent = subtract(pointArr[0], origin_);
                segmentData.end_tangent = subtract(pointArr[2], pointArr[1]);
                if (isZero(segmentData.start_tangent)) {
                    ComputeQuadTangents(segmentData, pointArr[0], pointArr[1], pointArr[2]);
                    break;
                } else if (isZero(segmentData.end_tangent)) {
                    ComputeQuadTangents(segmentData, origin_, pointArr[0], pointArr[1]);
                    break;
                }
                break;
            case kCGPathElementAddQuadCurveToPoint:
                segmentData.position = pointArr[1];
                ComputeQuadTangents(segmentData, origin_, pointArr[0], pointArr[1]);
                break;
            case kCGPathElementMoveToPoint:
            case kCGPathElementAddLineToPoint:
                segmentData.position = pointArr[0];
                segmentData.start_tangent = subtract(segmentData.position, origin_);
                segmentData.end_tangent = subtract(segmentData.position, origin_);
                break;
            case kCGPathElementCloseSubpath:
                segmentData.position = subpath_start_;
                segmentData.start_tangent = subtract(segmentData.position, origin_);
                segmentData.end_tangent = subtract(segmentData.position, origin_);
                break;
        }
        return segmentData;
    }

    private static void UpdateFromPathElement(PathElement pathElement) {
        SegmentData ExtractPathElementFeatures = ExtractPathElementFeatures(pathElement);
        out_slope_ = ExtractPathElementFeatures.start_tangent;
        if (element_index_ > 0) {
            RNSVGMarkerType rNSVGMarkerType = element_index_ == 1 ? RNSVGMarkerType.kStartMarker : RNSVGMarkerType.kMidMarker;
            positions_.add(new RNSVGMarkerPosition(rNSVGMarkerType, origin_, CurrentAngle(rNSVGMarkerType)));
        }
        in_slope_ = ExtractPathElementFeatures.end_tangent;
        origin_ = ExtractPathElementFeatures.position;
        if (pathElement.type == ElementType.kCGPathElementMoveToPoint) {
            subpath_start_ = pathElement.points[0];
        } else if (pathElement.type == ElementType.kCGPathElementCloseSubpath) {
            subpath_start_ = new Point(0.0d, 0.0d);
        }
        element_index_++;
    }
}
