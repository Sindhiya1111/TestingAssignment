package com.assignment.bipartite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionECCTest {

// Includes test function for all the ECC test cases
	
SolutionOne solution;
	
	@BeforeEach
	public void init() {
		solution = new SolutionOne();
	}
	
	@DisplayName("Test Case 1: A valid bipartite graph")
	@Test
    public void testBipartiteGraph_ECC_valid_bipartiteGraph_TC1() {
		
         // T1 : ECC 
		
        int[][] bipartiteGraph = {
            {1, 3},
            {0, 2},
            {1, 3},
            {0, 2}
        };
        assertTrue(solution.isBipartite(bipartiteGraph));
    }
	
	@DisplayName("Test Case 2: Is empty graph - FALSE")
	@Test
    public void testBipartiteGraph_ECC_invalid_emptyGraph_TC2() {
		 
         // T2 : ECC 
		
        int[][] bipartiteGraph = {
            {1},
            {0, 2},
            {1, 3},
            {0, 2}
        };
        assertTrue(solution.isBipartite(bipartiteGraph));
    }
	
	@DisplayName(" Test Case 3: Null graph")
	@Test
    public void testBipartiteGraph_ECC_invalid_nullValue_TC3() {
		//
		//T3 : ECC
        int[][] nonBipartiteGraph = {
        		null
        };
        assertThrows(NullPointerException.class,()->{
        	solution.isBipartite(nonBipartiteGraph);
        });
    }
	
	@DisplayName("Test Case 4: self_edge nodes")
	@Test
    public void testBipartiteGraph_ECC_invalid_selfEdge_TC4() {
		// 
		//T4 : ECC
        int[][] BipartiteGraph = {
        		{0},
        		{1},
        		{2}
        	};
        assertFalse(solution.isBipartite(BipartiteGraph));
    }
	
	@DisplayName("Test Case 5: Negative nodes")
	@Test
    public void testBipartiteGraph_ECC_invalid_negativeNodes_TC5() {
		// 
		// T5 : ECC
		
        int[][] BipartiteGraph = {
        	    {1, -2},
        	    {0},
        	    {0}
        	};
        assertThrows(ArrayIndexOutOfBoundsException.class,()->{
        	solution.isBipartite(BipartiteGraph);
        });
    }
	
	@DisplayName("Test Case 6: Node Out of range")
	@Test
    public void testBipartiteGraph_ECC_invalid_outOfRangeNodes_TC6() {
		// 
		// T6 : ECC
		
        int[][] BipartiteGraph = {
        	    {1, 4},
        	    {0, 2},
        	    {1, 3},
        	    {2}
        	};
        assertThrows(ArrayIndexOutOfBoundsException.class,()->{
        	solution.isBipartite(BipartiteGraph);
        });
    }
	
	@DisplayName("Test Case 7: Invalid - directed graph (Parallel edges)")
	@Test
    public void testBipartiteGraph_ECC_invalid_directedGraph_TC7() {
		// 
		// T7 : ECC
		
        int[][] nonBipartiteGraph = {
        	    {1, 2},
        	    {0, 2},
        	    {0, 1},
        	    {2}
        	};
        
        assertFalse(solution.isBipartite(nonBipartiteGraph));
    }
	
	@DisplayName("Test Case 8: Two colored graph")
	@Test
    public void testBipartiteGraph_ECC_valid__2Colored_bipartiteGraph_TC8() {
		 
         // T8 : ECC 
		
        int[][] bipartiteGraph = {
            {1, 3},
            {0, 2},
            {1, 3},
            {0, 2}
        };
        assertTrue(solution.isBipartite(bipartiteGraph));
    }
	
	@DisplayName("Test case 9: Non Bipartite graph two coloured and with odd cycle")
	@Test
	public void testBipartiteGraph_ECC_3Colored_oddCycle_nonBipartiteGraph_TC9() {
		//
		//T9 ECC
		
		int[][] bipartiteGraph = {
			    {1, 2, 3},
			    {0, 2},
			    {0, 1, 4},
			    {0, 4},
			    {2, 3}
			};
		
		assertFalse(solution.isBipartite(bipartiteGraph));
	}

}
