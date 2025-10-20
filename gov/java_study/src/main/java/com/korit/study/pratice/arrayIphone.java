package com.korit.study.pratice;

import java.util.Scanner;



public class arrayIphone {

    public static String[] products = new String[]
            {"아이폰17", "아이폰18", "아이폰19", "아이폰20",
                    "아이폰21", "아이폰22", "아이폰23", "아이폰24", "아이폰25"};

    public static String[] prices = new String[]
            {"12000", "13000", "14000", "15000",
                    "16000", "17000", "28000", "19000", "20000"};


    static void main(String[] args) {
        System.out.println("[ 상품 관리 시스템 ]");
        showMainMenu();
    }

    public static void showMainMenu() {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit) {
            System.out.println("1. 상품 추가");
            System.out.println("2. 상품 조회");
            System.out.println("3. 상품 수정");
            System.out.println("4. 상품 삭제");
            System.out.println("0. 종료");

            System.out.print("선택: ");
            int selectedNumber = sc.nextInt();
            sc.nextLine();


            if (selectedNumber == 0) {
                isExit = true;
            } else if (selectedNumber == 1) {
                register();

            } else if (selectedNumber == 2) {
                showProductList();
            } else if (selectedNumber == 3) {
                showUpdateList();
            }
        }
    }

    public static void register() {
        Scanner sc = new Scanner(System.in);
        String newProduct = null;
        String newPrice = null;

        while (true) {
            System.out.println("[상품 추가 기능]");
            System.out.println("상품 입력: ");
            newProduct = sc.nextLine();
            System.out.println("가격 입력: ");
            newPrice = sc.nextLine();

            if (findByProduct(newProduct) == null) {
                break;
            }
            System.out.println("이미 존재하는 상품입니다. 다시 입력하세요.");
        }
        addAll(newProduct, newPrice);
        System.out.println("상품 추가 완료 ^ w ^");

    }

    public static void showUpdateList() {
        Scanner sc = new Scanner(System.in);
        String newProduct = null;
        String newPrice = null;

        while (true) {
            System.out.println("[상품 수정 기능]");
            System.out.println("수정할 상품 입력: ");
            newProduct = sc.nextLine();
            System.out.println("수정될 가격 입력: ");
            newPrice = sc.nextLine();

            if (findByProduct(newProduct) == null) {
                break;
            }
            System.out.println("이미 존재하는 상품입니다. 다시 입력하세요.");
        }
        updateAll(newProduct, newPrice);
        System.out.println("상품 업데이트 완료 ^ w ^");

    }

    public static void updateAll(String product, String price) {
        String[] newProducts = new String[products.length + 1];
        String[] newPrices = new String[prices.length + 1];


        for (int i = 0; i < products.length; i++) {
            newProducts[i] = products[i];
        }
        newProducts[newProducts.length - 1] = product;
        products = newProducts;

        for (int i = 0; i < prices.length; i++) {
            newPrices[i] = prices[i];
        }
        newPrices[newPrices.length - 1] = price;
        prices = newPrices;
    }



    public static String findByProduct(String product) {
        for (String p : products) {
            if (p.equals(product)) {
                return p;
            }
        }
        return null;
    }

    public static void addAll(String product, String price) {
        String[] newProducts = new String[products.length + 1];
        String[] newPrices = new String[prices.length + 1];


        for (int i = 0; i < products.length; i++) {
            newProducts[i] = products[i];
        }
        newProducts[newProducts.length - 1] = product;
        products = newProducts;

        for (int i = 0; i < prices.length; i++) {
            newPrices[i] = prices[i];
        }
        newPrices[newPrices.length - 1] = price;
        prices = newPrices;
    }

    public static void showProductList() {
        Scanner sc = new Scanner(System.in);
        int size = 2;
        while (true) {
            System.out.println("사용자 정보 조회");
            System.out.println("뒤로 가려면 0을 입력하세요");
            System.out.printf("페이지 번호 입력(1 ~ %d): ", getLastPage(size));
            int selectedPage = sc.nextInt();
            sc.nextLine();

            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지는 찾을 수 없습니다");
            } else {
                String[] namesOfPaginationProduct = pagination(selectedPage, size,products);
                String[] namesOfPaginationPrice = pagination(selectedPage, size,prices);

                for (int i = 0; i < namesOfPaginationProduct.length; i++) {
                    System.out.printf("%d. %s\n", i + 1, namesOfPaginationProduct[i]);
                    System.out.printf("%d. %s\n", i + 1, namesOfPaginationPrice[i]);


                }
                System.out.println();
            }

        }

    }

    public static int getLastPage(int size) {
        return products.length % size == 0 ? products.length / size : products.length / size + 1;
        // 사이즈 : 9
        // 마지막 페이지 : 5 ( 9 / 2 + 1 )
    }
    public static String[] pagination(int page, int size, String[] what ) {
        int startIndex = (page - 1) * size; // 0 2 4 6 8
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        // 마지막 페이지의 사이즈
        // 마지막 페이지냐? 맞음 : size로 나눈 나머지가 마지막 페이지크기 여기서는 크기 1
        // 마지막 페이지가 아니면 size 그대로 4개의 크기임
        int paginationArraySize = isLast && what.length % size == 0 ? what.length % size : size;


        String[] paginationArray = new String[paginationArraySize];
        // 시작하는 인덱스부터 4개 혹은 마지막페이지 크기 둘 중 하나를 더함
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = what[i];

        }

        return paginationArray ;


    }
}












