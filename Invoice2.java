public class Invoice2 {
    public static void main(String[] args) {
        System.out.println("    Bill To:                                            Ship To:");
        System.out.println("""  
            C026-01-0748/2024                                   Arnold Mutwiri
            No 23/2, SBI Colony                                 N0 23/2 SBI, Colony
            Ragavendra Nagar, chennai-600124                    Ragavendra Nagar, chennai-600124 
            GSTIN:33APFSDF1ZV                                   GSTIN:33APFSDF1ZV
            Contact: +91-7869825463                             Contact: +91-7869825463
            Email: purchase-team@thendral.com                   Email: purchase-team@thendral.com
        """);
        System.out.println("\n-------------------------------------------------------------------------------------------------------\n");
        System.out.println("        Payment Date: 7 days from date of delivery      Payment Terms: 100% against invoice\n");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("     |              |                   |            |          |       |        |     |");
        System.out.println("s.No | Product Code | Product Name      |  HSN Code  | Quantity | Units | Rate   | Tax |   Amount");
        System.out.println("-----|--------------|-------------------|------------|----------|-------|--------|-----|---------------");
        System.out.println(" 1   |      105     | Surf Excel 5kg    |   34019011 |     20   |  nos  | 600.00 |  5% |  12600.00");
        System.out.println("-----|--------------|-------------------|------------|----------|-------|--------|-----|---------------");
        System.out.println(" 2   |      109     | Rin 1kg           |   34019011 |     25   |  nos  |  85.00 |  5% |   2231.00");
        System.out.println("-----|--------------|-------------------|------------|----------|-------|--------|-----|---------------");
        System.out.println(" 3   |      115     | Hamam soap 150g   |   34011100 |     25   |  nos  |  60.00 |  5% |   1575.00");
        System.out.println("-----|--------------|-------------------|------------|----------|-------|--------|-----|---------------");
        System.out.println(" 4   |      120     | Lux soap 150g     |   34011100 |     30   |  nos  |  53.00 |  5% |    443.00");
        System.out.println("-----|--------------|-------------------|------------|----------|-------|--------|-----|---------------");
        System.out.println(" 5   |      125     | Dove soap 125g    |   34011100 |     25   |  nos  |  75.00 |  5% |   1968.00");
        System.out.println("-----|--------------|-------------------|------------|----------|-------|--------|-----|---------------");
        System.out.println(" 6   |      129     | Vim bar 200g      |   08109010 |     20   |  nos  |  15.00 |  5% |    315.00");
        System.out.println("-----|--------------|-------------------|------------|----------|-------|--------|-----|---------------");
        System.out.println(" 7   |      131     | Pepsodent 150g    |   33601020 |     30   |  nos  |  85.00 | 18% |   3009.00");
        System.out.println("-----|--------------|-------------------|------------|----------|-------|--------|-----|---------------");
        System.out.println("                                                                          Total        | 22141.00");
        System.out.println("                                                                                       |---------------");
        System.out.println("                                                                          Discounts    |   141.00");
        System.out.println("                                                                                       |---------------");
        System.out.println("                                                                          Grand Total  | 22000.00");
        System.out.println("                                                                                       |---------------");
    }
}
