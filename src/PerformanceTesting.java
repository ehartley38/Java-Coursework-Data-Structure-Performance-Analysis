import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class PerformanceTesting {

    Test arrayInsertionTest, arrayLookupTest, arrayDeletionTestName, arrayDeletionTestExtension;
    Test listInsertionTest, listLookupTest, listDeletionTestName, listDeleTionTestExtension;
    Test hashInsertionTest, hashLookupTest, hashDeletionTestName, hashDeleTionTestExtension;

    ArrayList<Test> arrayTests = new ArrayList<Test>();
    ArrayList<Test> arrayListTests = new ArrayList<Test>();
    ArrayList<Test> hashMapTests = new ArrayList<Test>();


    //Create instances of Test class with each different test for each directory type. Then add the objects to an array list
    //containing all test objects for that directory class
    public PerformanceTesting() throws FileNotFoundException {


        arrayInsertionTest = new Test("array","dataInsertion");
        arrayLookupTest = new Test("array", "dataLookup");
        arrayDeletionTestName = new Test("array", "dataDeletionWithName");
        arrayDeletionTestExtension = new Test("array", "dataDeletionWithExtension");
        Collections.addAll(arrayTests, arrayInsertionTest, arrayLookupTest, arrayDeletionTestName, arrayDeletionTestExtension);

        //Initialise arrayList tests
        listInsertionTest = new Test("arraylist","dataInsertion");
        listLookupTest = new Test("arraylist", "dataLookup");
        listDeletionTestName = new Test("arraylist", "dataDeletionWithName");
        listDeleTionTestExtension = new Test("arraylist", "dataDeletionWithExtension");
        Collections.addAll(arrayListTests,listInsertionTest, listLookupTest, listDeletionTestName, listDeleTionTestExtension);

        //Initialise hashMap tests
        hashInsertionTest = new Test("hashmap","dataInsertion");
        hashLookupTest = new Test("hashmap", "dataLookup");
        hashDeletionTestName = new Test("hashmap", "dataDeletionWithName");
        hashDeleTionTestExtension = new Test("hashmap", "dataDeletionWithExtension");
        Collections.addAll(hashMapTests, hashInsertionTest, hashLookupTest, hashDeletionTestName, hashDeleTionTestExtension);


    }








}
