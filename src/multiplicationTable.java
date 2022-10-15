class MultiplicationTable {
    void table(int i,int from,int to){
        for(int j=from; j<=to; j++){
            System.out.printf("%d * %d = %d",i,j,i*j).println();
        }

    }
    public static void main(String[] args) {
        MultiplicationTable requiredTable = new MultiplicationTable();
        requiredTable.table(9,20,40);
    }

}
