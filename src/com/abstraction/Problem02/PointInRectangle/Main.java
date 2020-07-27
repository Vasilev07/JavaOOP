package com.abstraction.Problem02.PointInRectangle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rectangleCoordinates = scanner.nextLine();

        int input[] = Arrays.stream(rectangleCoordinates.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Rectangle rectangle = new Rectangle(input[0], input[1], input[2], input[3]);

        int numberOfPointsToCheck = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPointsToCheck; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);

            System.out.println(rectangle.contains(point));
        }
    }
}
